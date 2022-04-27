package Lesson_Pr_7_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JPanel {

    private MainFrame parent;

    private JLabel labelName;
    private JTextField textFieldName;

    private JLabel labelSurName;
    private JTextField textFieldSurName;

    private JLabel labelFaculty;
    private JComboBox comboBoxFaculty;

    private JLabel labelGroup;
    private JTextField textFieldGroup;

    private JButton addButton;
    private JButton backButton;

    public FirstPage(MainFrame parent) {

        this.parent = parent;

        setSize(550, 500);
        setLayout(null);

        String facultyValue[] = {"", "Information Technologies", "Economics", "Mathematics"};

        labelName = new JLabel("NAME:");
        labelName.setSize(200, 30);
        labelName.setLocation(100, 100);
        add(labelName);

        textFieldName = new JTextField("");
        textFieldName.setSize(250, 30);
        textFieldName.setLocation(180, 100);
        add(textFieldName);

        labelSurName = new JLabel("SURNAME:");
        labelSurName.setSize(200, 30);
        labelSurName.setLocation(100, 150);
        add(labelSurName);

        textFieldSurName = new JTextField("");
        textFieldSurName.setSize(250, 30);
        textFieldSurName.setLocation(180, 150);
        add(textFieldSurName);

        labelFaculty = new JLabel("FACULTY:");
        labelFaculty.setSize(200, 30);
        labelFaculty.setLocation(100, 200);
        add(labelFaculty);

        comboBoxFaculty = new JComboBox(facultyValue);
        comboBoxFaculty.setSize(250, 30);
        comboBoxFaculty.setLocation(180, 200);
        add(comboBoxFaculty);

        labelGroup = new JLabel("GROUP:");
        labelGroup.setSize(200, 30);
        labelGroup.setLocation(100, 250);
        add(labelGroup);

        textFieldGroup = new JTextField("");
        textFieldGroup.setSize(250, 30);
        textFieldGroup.setLocation(180, 250);
        add(textFieldGroup);

        addButton = new JButton("ADD");
        addButton.setSize(150, 30);
        addButton.setLocation(100, 300);
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setAddButton();
                //parent.getFirstPage().setVisible(false);
                //parent.getMainMenuPage().setVisible(true);
            }
        });

        backButton = new JButton("BACK");
        backButton.setSize(150, 30);
        backButton.setLocation(280, 300);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }

    private void setAddButton() {
        String textName = "";
        if (textFieldName.getText() != null)
            textName = textFieldName.getText();
        String textSurName = "";
        if (textFieldSurName.getText() != null)
            textSurName = textFieldSurName.getText();
        String textFaculty = (String) comboBoxFaculty.getSelectedItem();
        String textGroup = "";
        if (textFieldGroup.getText() != null)
            textGroup = textFieldGroup.getText();

        if (!textName.equals("") && !textSurName.equals("") && !textGroup.equals("") && comboBoxFaculty.getSelectedIndex() != 0) {
            parent.students[parent.count_students] = new Students(parent.count_students+1, textName, textSurName, textFaculty, textGroup);
            parent.count_students++;
            //System.out.println(parent.count_students);
            //Очищаем txtField и agesBox, после успешной операции
            textFieldName.setText("");
            textFieldSurName.setText("");
            comboBoxFaculty.setSelectedIndex(0);
            textFieldGroup.setText("");
        } else {
            JOptionPane.showMessageDialog(parent, "Заполните все поля");
        }
    }
}