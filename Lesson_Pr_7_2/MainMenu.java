package Lesson_Pr_7_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;

    private JButton addStudentPageButton;
    private JButton listStudentPageButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        addStudentPageButton = new JButton("ADD STUDENT");
        addStudentPageButton.setSize(300,30);
        addStudentPageButton.setLocation(100,100);
        add(addStudentPageButton);
        addStudentPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getFirstPage().setVisible(true);
            }
        });

        listStudentPageButton = new JButton("LIST STUDENTS");
        listStudentPageButton.setSize(300,30);
        listStudentPageButton.setLocation(100,150);
        add(listStudentPageButton);
        listStudentPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getSecondPage().generateTable(parent.getStudents());
                parent.getMainMenuPage().setVisible(false);
                parent.getSecondPage().setVisible(true);
            }
        });

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}