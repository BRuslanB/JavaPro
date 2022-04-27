package Lesson_Pr_7_1;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JButton buttonAdd;
    private JLabel labelName;
    private JLabel labelPhone;
    private JLabel labelAge;
    private JTextField textFieldName;
    private JTextField textFieldPhone;
    private JComboBox comboBoxAge;
    private JTextArea textAreaOutput;
    private Integer[] ages = new Integer[100];

    //Объявляем конструктор нашего MainFrame. Именно тут происходит отрисовка нашего окна
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        for(Integer i =0;i<100;i++){
            ages[i]= i;
        }

        labelName = new JLabel("Name:");
        labelName.setSize(300,30);
        labelName.setLocation(100,100);
        add(labelName);

        textFieldName = new JTextField("");
        textFieldName.setSize(300,30);
        textFieldName.setLocation(150,100);
        add(textFieldName);

        labelPhone = new JLabel("Phone:");
        labelPhone.setSize(300,30);
        labelPhone.setLocation(100,150);
        add(labelPhone);

        textFieldPhone = new JTextField("");
        textFieldPhone.setSize(300,30);
        textFieldPhone.setLocation(150,150);
        add(textFieldPhone);

        labelAge = new JLabel("Age:");
        labelAge.setSize(300,30);
        labelAge.setLocation(100,200);
        add(labelAge);

        comboBoxAge = new JComboBox(ages);
        comboBoxAge.setSize(300,30);
        comboBoxAge.setLocation(150,200);
        add(comboBoxAge);

        buttonAdd = new JButton("ADD CONTACT");
        buttonAdd.setSize(350,30);
        buttonAdd.setLocation(100,250);
        add(buttonAdd);

        textAreaOutput = new JTextArea("");
        textAreaOutput.setSize(350,120);
        textAreaOutput.setLocation(100,300);
        textAreaOutput.setEditable(false);
        add(textAreaOutput);

        //Подвязываем объект интерфейса ActionListener к button
        buttonAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Пишем, что должно произойти при нажатии на кнопку
                String textName = textFieldName.getText();
                String textPhone = textFieldPhone.getText();
                Integer age = (Integer) comboBoxAge.getSelectedItem();
                if(!textName.equals("") && !textPhone.equals("")){
                    textAreaOutput.append(textName + " - " + textPhone + " - " + age+" years \n");
                    //Очищаем txtField и agesBox, после успешной операции
                    textFieldName.setText("");
                    textFieldPhone.setText("");
                    comboBoxAge.setSelectedIndex(0);
                }
            }
        });
    }
}