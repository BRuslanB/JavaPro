package Lesson_Pr_7_2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {

    private MainFrame parent;

    private JLabel label;
    private JButton back;

    private String header[] = {"ID","Name","Surname","Faculty","Group"};
    private JTable table;
    private JScrollPane scrollPane;


    public SecondPage(MainFrame parent) {

        this.parent = parent;

        setSize(550,500);
        setLayout(null);

        label = new JLabel("LIST STUDENT");
        label.setSize(300,30);
        label.setLocation(100,80);
        add(label);

        back = new JButton("Back");
        back.setSize(300,30);
        back.setLocation(120,380);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });

        //Создаем таблицу
        table = new JTable();
        table.setFont(new Font("Calibri", Font.PLAIN, 12));
        table.setRowHeight(30);

        //Создаем панель для прокрутки
        scrollPane = new JScrollPane(table);
        scrollPane.setSize(350,240);
        scrollPane.setLocation(100,120);
        add(scrollPane);
    }

    public void generateTable(Students[] students){

        //Создаем двумерный массив из нашего массива объектов, чтобы JTable смог его обработать
        //students.length - количество строк, 5 - это количество колонок.

        Object data[][] = new Object[students.length][5];

        int i=0;
        data[i][0] = null;
        data[i][1] = "";
        data[i][2] = "";
        data[i][3] = "";
        data[i][4] = "";

        while(students[i] != null && i < students.length) {
            data[i][0] = students[i].getId();
            data[i][1] = students[i].getName();
            data[i][2] = students[i].getSurname();
            data[i][3] = students[i].getFaculty();
            data[i][4] = students[i].getGroup();
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(data, header);
            table.setModel(model);

    }
}