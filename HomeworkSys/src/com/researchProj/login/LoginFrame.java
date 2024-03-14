package com.researchProj.login;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Student Homework System");
        setSize(1200, 600); // 调整窗口大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // 使用绝对布局
        JLabel loginLabel = new JLabel("Login"); // 添加 "Login" 文本
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        Font labelFont = new Font("Arial", Font.BOLD, 20); // 放大字号
        usernameLabel.setFont(labelFont); // 设置字号
        passwordLabel.setFont(labelFont); // 设置字号
        loginLabel.setFont(new Font("Arial", Font.BOLD, 36));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");
        JButton forgetPasswordButton = new JButton("Forget Password");

        Font buttonFont = new Font("Arial", Font.BOLD, 16); // 放大按钮字体
        loginButton.setFont(buttonFont); // 设置按钮字体
        registerButton.setFont(buttonFont); // 设置按钮字体
        forgetPasswordButton.setFont(buttonFont);
        // 设置元素的位置和大小
        loginLabel.setBounds(20, 20, 200, 60);
        usernameLabel.setBounds(100, 150, 200, 60);
        usernameField.setBounds(320, 150, 600, 60);
        passwordLabel.setBounds(100, 250, 200, 60);
        passwordField.setBounds(320, 250, 600, 60);
        loginButton.setBounds(150, 400, 200, 60);
        registerButton.setBounds(450, 400, 200, 60);
        forgetPasswordButton.setBounds(750, 400, 200, 60);

        add(loginLabel);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(registerButton);
        add(forgetPasswordButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
