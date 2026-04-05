import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class RecruitmentSystemGUI extends JFrame {

    ArrayList<String> qualifiedApplicants = new ArrayList<>();  
    ArrayList<String> applicants = new ArrayList<>();
    ArrayList<String> rejectedApplicants = new ArrayList<>();
    int applicantScore = 0;
    int applicantIDCounter = 1;

    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);

    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel loginStatus = new JLabel("", JLabel.CENTER);

    JTextField nameField = new JTextField();
    JTextField ageField = new JTextField();
    JTextField emailField = new JTextField();
    JTextField phoneField = new JTextField();
    JComboBox<String> eduBox = new JComboBox<>(new String[]{
        "College Graduate", "College Undergraduate",
        "Senior High School Graduate", "Junior High School Graduate",
        "Elementary School Graduate"
    });
    JCheckBox birthCertBox = new JCheckBox("Birth Certificate");
    JCheckBox idBox = new JCheckBox("Valid ID");
    JCheckBox medicalBox = new JCheckBox("Medical Record");
    JCheckBox nbiBox = new JCheckBox("NBI Clearance");

    JRadioButton service1 = new JRadioButton("Resume & CV Writing ($50)");
    JRadioButton service2 = new JRadioButton("Interview Coaching ($60)");
    JRadioButton service3 = new JRadioButton("Language Training ($70)");
    JComboBox<String> dayBox = new JComboBox<>(new String[]{
        "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
    });

    JComboBox<String> industryBox = new JComboBox<>(new String[]{
        "Lodging Industry","Food Industry","Healthcare Industry"
    });
    JComboBox<String> companyBox = new JComboBox<>();
    JComboBox<String> jobBox = new JComboBox<>();
    JLabel salaryLabel = new JLabel("Salary: $0");

    JTextArea deploymentArea = new JTextArea();

    String Username = "ReyLenin7788";
    String Password = "P@ssw0rd0_123!";

    public RecruitmentSystemGUI() {
        setTitle("REYCRUITMENT AGENCY");
        setSize(1500, 2000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel loginPanel = new JPanel(new GridLayout(0,1,3,3));
        loginPanel.setBackground(Color.BLACK);
        JLabel loginTitle = new JLabel("Welcome to Reycruitment Solutions", JLabel.CENTER);
        loginTitle.setForeground(Color.YELLOW);
        loginTitle.setFont(new Font("Arial", Font.BOLD, 40));
        loginPanel.add(loginTitle);

        JLabel userLabel = new JLabel("Username:", JLabel.CENTER);
        userLabel.setForeground(Color.GREEN);
        userLabel.setFont(new Font("Arial", Font.BOLD, 25)); 
        loginPanel.add(userLabel);
        loginPanel.add(usernameField);

        JLabel passLabel = new JLabel("Password:", JLabel.CENTER);
        passLabel.setForeground(Color.GREEN);
        passLabel.setFont(new Font("Arial", Font.BOLD, 25)); 
        loginPanel.add(passLabel);
        loginPanel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.GREEN);
        loginButton.setFont(new Font("Arial", Font.BOLD, 25));
        loginPanel.add(loginButton);

        loginStatus.setForeground(Color.GREEN);
        loginPanel.add(loginStatus);

        loginButton.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            if(user.equals(Username) && pass.equals(Password)) {
                loginStatus.setText("Login Successful!");
                cardLayout.show(mainPanel, "menu");
            } else {
                loginStatus.setText("Invalid login, try again.");
            }
        });


        JPanel menuPanel = new JPanel(new GridLayout(0,1,10,10));
        menuPanel.setBackground(Color.BLACK);

        JLabel menuTitle = new JLabel("REYCRUITMENT SYSTEM", JLabel.CENTER);
        menuTitle.setFont(new Font("Arial", Font.BOLD, 20));
        menuTitle.setForeground(Color.YELLOW);
        menuPanel.add(menuTitle);

        JButton addApplicantBtn = new JButton("Add Applicant");
        JButton agencyBtn = new JButton("Agency Offerings");
        JButton interviewBtn = new JButton("Interview Applicant");
        JButton jobBtn = new JButton("Select Job");
        JButton deployBtn = new JButton("Deployment Info");
        JButton exitBtn = new JButton("Exit");


        for(JButton btn : new JButton[]{addApplicantBtn, agencyBtn, interviewBtn, jobBtn, deployBtn}) {
            btn.setBackground(Color.BLACK);
            btn.setForeground(Color.GREEN);
        }
        exitBtn.setBackground(Color.BLACK);
        exitBtn.setForeground(Color.RED);


        menuPanel.add(addApplicantBtn);
        menuPanel.add(agencyBtn);
        menuPanel.add(interviewBtn);
        menuPanel.add(jobBtn);
        menuPanel.add(deployBtn);
        menuPanel.add(exitBtn);


        addApplicantBtn.addActionListener(e -> cardLayout.show(mainPanel, "applicant"));

        agencyBtn.addActionListener(e -> {
            if(applicants.isEmpty()) {
                JOptionPane.showMessageDialog(this, "There's no applicants added", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String idStr = JOptionPane.showInputDialog(this, "Enter Applicant ID:");
                try {
                    int id = Integer.parseInt(idStr);
                    if(id <= 0 || id > applicantIDCounter-1) {
                        JOptionPane.showMessageDialog(this, "Invalid Applicant ID", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        cardLayout.show(mainPanel, "service");
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        interviewBtn.addActionListener(e -> {
            if(applicants.isEmpty()) {
                JOptionPane.showMessageDialog(this, "There's no applicants added", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String idStr = JOptionPane.showInputDialog(this, "Enter Applicant ID:");
                try {
                    int id = Integer.parseInt(idStr);
                    if(id <= 0 || id > applicantIDCounter-1) {
                        JOptionPane.showMessageDialog(this, "Invalid Applicant ID", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        cardLayout.show(mainPanel, "interview");
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        jobBtn.addActionListener(e -> {
            if(qualifiedApplicants.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Applicant Should Undergo Interview",
                    "Interview Required", JOptionPane.WARNING_MESSAGE);
            } else {
                String idStr = JOptionPane.showInputDialog(this, "Enter Applicant ID:");
                try {
                    int id = Integer.parseInt(idStr);
                    if(id <= 0 || id > applicantIDCounter-1) {
                        JOptionPane.showMessageDialog(this, "Invalid Applicant ID", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        boolean isQualified = qualifiedApplicants.stream().anyMatch(app -> app.contains("ID: " + id));
                        if(isQualified) {
                            cardLayout.show(mainPanel, "job");
                        } else {
                            JOptionPane.showMessageDialog(this,
                                "Applicant Should Undergo Interview",
                                "Interview Required", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        deployBtn.addActionListener(e -> {
            if(qualifiedApplicants.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Applicant Should Undergo Interview",
                    "Interview Required", JOptionPane.WARNING_MESSAGE);
            } else {
                String idStr = JOptionPane.showInputDialog(this, "Enter Applicant ID:");
                try {
                    int id = Integer.parseInt(idStr);
                    if(id <= 0 || id > applicantIDCounter-1) {
                        JOptionPane.showMessageDialog(this, "Invalid Applicant ID", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        boolean isQualified = qualifiedApplicants.stream().anyMatch(app -> app.contains("ID: " + id));
                        if(isQualified) {
                            cardLayout.show(mainPanel, "deploy");
                        } else {
                            JOptionPane.showMessageDialog(this,
                                "Applicant Should Undergo Interview",
                                "Interview Required", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        exitBtn.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });


        addApplicantBtn.addActionListener(e -> cardLayout.show(mainPanel, "applicant"));

        deployBtn.addActionListener(e -> {
            if(qualifiedApplicants.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Applicant Should Undergo Interview",
                    "Interview Required", JOptionPane.WARNING_MESSAGE);
            } else {
                String idStr = JOptionPane.showInputDialog(this, "Enter Applicant ID:");
                try {
                    int id = Integer.parseInt(idStr);
                    if(id <= 0 || id > applicantIDCounter-1) {
                        JOptionPane.showMessageDialog(this, "Invalid Applicant ID", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String applicantInfo = qualifiedApplicants.stream()
                            .filter(app -> app.contains("ID: " + id))
                            .findFirst()
                            .orElse(null);

                        if(applicantInfo == null) {
                            JOptionPane.showMessageDialog(this,
                                "Applicant Should Undergo Interview",
                                "Interview Required", JOptionPane.WARNING_MESSAGE);
                        } else {
                            String jobSelected = (String) jobBox.getSelectedItem();
                            double jobSalary = 0;
                            if(jobSelected != null && jobSelected.contains("$")) {
                                jobSalary = Double.parseDouble(
                                    jobSelected.substring(jobSelected.indexOf("$")+1, jobSelected.length()-1)
                                );
                            }

                            double placementFee = jobSalary * 0.10;
                            double retainerFee = 100;
                            double monthlySalary = jobSalary; 
                            double weeklySalary = jobSalary / 4.0;
                            double annualSalary = jobSalary * 12;

                            String serviceChosen = "NONE";
                            double agencyFee = 0;
                            if(service1.isSelected()) { serviceChosen = "Resume & CV Writing ($50)"; agencyFee = 50; }
                            else if(service2.isSelected()) { serviceChosen = "Interview Coaching ($60)"; agencyFee = 60; }
                            else if(service3.isSelected()) { serviceChosen = "Language Training ($70)"; agencyFee = 70; }

                            StringBuilder sb = new StringBuilder();
                            sb.append("==================================\n");
                            sb.append("======= REYCRUITMENT AGENCY ======\n");
                            sb.append("===== FINAL DEPLOYMENT INFO =====\n");
                            sb.append("==================================\n\n");

                            sb.append("Applicant Info:\n");
                            applicantInfo = qualifiedApplicants.stream()
                                .filter(app -> app.contains("ID: " + id))
                                .findFirst()
                                .orElse("Applicant Info Not Found");

                            String[] parts = applicantInfo.split(",");
                            for(String part : parts) {
                                sb.append(part.trim()).append("\n");
                            }
                            sb.append("\n");

                            sb.append("Job Selected: ").append(jobSelected).append("\n\n");

                            sb.append("Salary Details:\n");
                            sb.append("Monthly Salary: $").append(monthlySalary).append("\n");
                            sb.append("Weekly Salary: $").append(weeklySalary).append("\n");
                            sb.append("Annual Salary: $").append(annualSalary).append("\n\n");

                            sb.append("Placement Fee (10%): $").append(placementFee).append("\n");
                            sb.append("Retainer Fee: $").append(retainerFee).append("\n");
                            sb.append("Net Salary (after fees): $")
                            .append(monthlySalary - placementFee - retainerFee - agencyFee).append("\n\n");

                            sb.append("Agency Service Chosen: ").append(serviceChosen).append("\n");
                            sb.append("Agency Service Fee: $").append(agencyFee).append("\n");
                            sb.append("Agency Service Schedule: ").append(dayBox.getSelectedItem()).append("\n\n");

                            sb.append("Policy: Free replacement if employee leaves within 3 months\n\n");

                            sb.append("==================================\n");  

                            deploymentArea.setText(sb.toString());
                            cardLayout.show(mainPanel, "deploy");
                        }
                    }
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        exitBtn.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        JPanel applicantPanel = new JPanel(new GridLayout(0,2,10,10));
        applicantPanel.setBackground(Color.BLACK);

        applicantPanel.add(label("Full Name:")); applicantPanel.add(nameField);
        applicantPanel.add(label("Age:")); applicantPanel.add(ageField);
        applicantPanel.add(label("Email:")); applicantPanel.add(emailField);
        applicantPanel.add(label("Phone:")); applicantPanel.add(phoneField);
        applicantPanel.add(label("Education:")); applicantPanel.add(eduBox);

        birthCertBox.setForeground(Color.GREEN);
        idBox.setForeground(Color.GREEN);
        medicalBox.setForeground(Color.GREEN);
        nbiBox.setForeground(Color.GREEN);

        applicantPanel.add(birthCertBox); applicantPanel.add(idBox);
        applicantPanel.add(medicalBox); applicantPanel.add(nbiBox);

        JButton saveApplicantBtn = new JButton("Save Applicant");
        saveApplicantBtn.setBackground(Color.BLACK);
        saveApplicantBtn.setForeground(Color.GREEN);

        applicantPanel.add(new JLabel(""));
        applicantPanel.add(saveApplicantBtn);

        saveApplicantBtn.addActionListener(e -> {
        int age = Integer.parseInt(ageField.getText());

        String applicantInfo = "ID: " + applicantIDCounter +
                                ", Name: " + nameField.getText() +
                                ", Age: " + ageField.getText() +
                                ", Email: " + emailField.getText() +
                                ", Phone: " + phoneField.getText() +
                                ", Education: " + eduBox.getSelectedItem();

        if(age < 18) {
            rejectedApplicants.add(applicantInfo + " (Rejected: Below 18)");
            JOptionPane.showMessageDialog(this,
                "Applicant Rejected (Below 18)\n" + applicantInfo,
                "Rejected", JOptionPane.ERROR_MESSAGE);
        } else if(!birthCertBox.isSelected() || !idBox.isSelected() ||
                !medicalBox.isSelected() || !nbiBox.isSelected()) {
            rejectedApplicants.add(applicantInfo + " (Rejected: Missing Requirements)");
            JOptionPane.showMessageDialog(this,
                "Applicant Rejected (Missing Requirements)\n" + applicantInfo,
                "Rejected", JOptionPane.ERROR_MESSAGE);
        } else {
            applicants.add(applicantInfo);
            JOptionPane.showMessageDialog(this,
                "Applicant Saved!\nProceed to Interview.\n" + applicantInfo,
                "Saved", JOptionPane.INFORMATION_MESSAGE);
            applicantIDCounter++;
        }
        nameField.setText("");
        ageField.setText("");
        emailField.setText("");
        phoneField.setText("");
        eduBox.setSelectedIndex(0);
        birthCertBox.setSelected(false);
        idBox.setSelected(false);
        medicalBox.setSelected(false);
        nbiBox.setSelected(false);

        cardLayout.show(mainPanel, "menu");
    });

        JPanel agencyPanel = new JPanel(new GridLayout(0,1,10,10));
        agencyPanel.setBackground(Color.BLACK);

        service1.setForeground(Color.GREEN);
        service2.setForeground(Color.GREEN);
        service3.setForeground(Color.GREEN);

        ButtonGroup group = new ButtonGroup();
        group.add(service1); group.add(service2); group.add(service3);

        agencyPanel.add(label("Choose a Service:"));
        agencyPanel.add(service1);
        agencyPanel.add(service2);
        agencyPanel.add(service3);

        agencyPanel.add(label("Choose a Day:"));
        agencyPanel.add(dayBox);

        JButton confirmAgencyBtn = new JButton("Confirm Service");
        confirmAgencyBtn.setBackground(Color.BLACK);
        confirmAgencyBtn.setForeground(Color.GREEN);
        agencyPanel.add(confirmAgencyBtn);

        confirmAgencyBtn.addActionListener(e -> {
            String service = service1.isSelected() ? "Resume & CV Writing ($50)" :
                             service2.isSelected() ? "Interview Coaching ($60)" :
                             service3.isSelected() ? "Language Training ($70)" : "None";

            JOptionPane.showMessageDialog(this,
                "Service Selected: " + service + "\nDay: " + dayBox.getSelectedItem(),
                "Agency Confirmation", JOptionPane.INFORMATION_MESSAGE);

            cardLayout.show(mainPanel, "menu");
        });

        JPanel jobPanel = new JPanel(new GridLayout(0,1,10,10));
        jobPanel.setBackground(Color.BLACK);

        jobPanel.add(label("Select Industry:"));
        jobPanel.add(industryBox);
        jobPanel.add(label("Select Company:"));
        jobPanel.add(companyBox);
        jobPanel.add(label("Select Job:"));
        jobPanel.add(jobBox);

        salaryLabel.setForeground(Color.GREEN);
        jobPanel.add(salaryLabel);

        JButton confirmJobBtn = new JButton("Confirm Job");
        confirmJobBtn.setBackground(Color.BLACK);
        confirmJobBtn.setForeground(Color.GREEN);
        jobPanel.add(confirmJobBtn);

        industryBox.addActionListener(e -> {
        companyBox.removeAllItems();
        jobBox.removeAllItems();

        String industry = (String) industryBox.getSelectedItem();
        if(industry.equals("Lodging Industry")) {
            companyBox.addItem("Marriott International - United States");
            companyBox.addItem("OYO Rooms - India");
            companyBox.addItem("Accor - France");
            companyBox.addItem("IHG Hotels & Resorts - United Kingdom");
            companyBox.addItem("H World Group Limited - China");
        } else if(industry.equals("Food Industry")) {
            companyBox.addItem("Nestlé - Switzerland");
            companyBox.addItem("Ajinomoto Inc. - Japan");
            companyBox.addItem("Danone - France");
            companyBox.addItem("Grupo Bimbo - Mexico");
            companyBox.addItem("Unilever - United Kingdom");
        } else if(industry.equals("Healthcare Industry")) {
            companyBox.addItem("Pfizer Inc. - United States");
            companyBox.addItem("Roche - Switzerland");
            companyBox.addItem("Sanofi - France");
            companyBox.addItem("AstraZeneca - United Kingdom");
            companyBox.addItem("Takeda Pharmaceutical Company - Japan");
        }
    });

        companyBox.addActionListener(e -> {
        jobBox.removeAllItems();
        boolean isGraduate = eduBox.getSelectedItem().equals("College Graduate");
        String industry = (String) industryBox.getSelectedItem();

        if(industry.equals("Lodging Industry")) {
            if(isGraduate) {
                jobBox.addItem("Hotel Manager ($1550)");
                jobBox.addItem("Front Desk Receptionist ($697)");
                jobBox.addItem("Housekeeper ($650)");
                jobBox.addItem("Maintenance Technician ($900)");
                jobBox.addItem("Security Officer ($750)");
            } else {
                jobBox.addItem("Housekeeper ($650)");
                jobBox.addItem("Security Officer ($750)");
            }
        } else if(industry.equals("Food Industry")) {
            if(isGraduate) {
                jobBox.addItem("Food Technologist ($375)");
                jobBox.addItem("Food Technician ($340)");
                jobBox.addItem("Quality Assurance Officer ($450)");
                jobBox.addItem("Production Supervisor ($715)");
                jobBox.addItem("R&D Specialist ($825)");
            } else {
                jobBox.addItem("Food Technician ($340)");
                jobBox.addItem("Production Supervisor ($715)");
            }
        } else if(industry.equals("Healthcare Industry")) {
            if(isGraduate) {
                jobBox.addItem("Medical Assistant ($2800)");
                jobBox.addItem("Front Desk Staff ($1700)");
                jobBox.addItem("Clinic Cleaner ($1200)");
                jobBox.addItem("Caregiver ($1560)");
                jobBox.addItem("Lab Helper ($1920)");
            } else {
                jobBox.addItem("Clinic Cleaner ($1200)");
                jobBox.addItem("Caregiver ($1560)");
            }
        }
    });

        jobBox.addActionListener(e -> {
            String job = (String) jobBox.getSelectedItem();
            if(job != null && job.contains("$")) {
                salaryLabel.setText("Salary: " + job.substring(job.indexOf("$")));
            }
        });

        confirmJobBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                "Industry: " + industryBox.getSelectedItem() +
                "\nCompany: " + companyBox.getSelectedItem() +
                "\nJob: " + jobBox.getSelectedItem() +
                "\n" + salaryLabel.getText(),
                "Job Confirmation", JOptionPane.INFORMATION_MESSAGE);

            cardLayout.show(mainPanel, "menu");
        });

        JPanel deployPanel = new JPanel(new BorderLayout());
        deployPanel.setBackground(Color.BLACK);

        deploymentArea.setEditable(false);
        deploymentArea.setForeground(Color.GREEN);
        deploymentArea.setBackground(Color.BLACK);
        deploymentArea.setText("Deployment info will appear here...");

        deployPanel.add(new JScrollPane(deploymentArea), BorderLayout.CENTER);

        JButton backBtn = new JButton("Back to Menu");
        backBtn.setBackground(Color.BLACK);
        backBtn.setForeground(Color.GREEN);
        deployPanel.add(backBtn, BorderLayout.SOUTH);

        backBtn.addActionListener(e -> cardLayout.show(mainPanel, "menu"));

        JPanel interviewPanel = new JPanel(new GridLayout(0,1,10,10));
        interviewPanel.setBackground(Color.BLACK);

        JLabel q1 = new JLabel("Do you have prior work experience?");
        q1.setForeground(Color.GREEN);
        JCheckBox q1Yes = new JCheckBox("Yes");
        JCheckBox q1No = new JCheckBox("No");
        q1Yes.setForeground(Color.GREEN);
        q1No.setForeground(Color.GREEN);

        interviewPanel.add(q1);
        interviewPanel.add(q1Yes);
        interviewPanel.add(q1No);

        JLabel q2 = new JLabel("How many companies have you worked for?");
        q2.setForeground(Color.GREEN);
        JTextField companyCountField = new JTextField();
        interviewPanel.add(q2);
        interviewPanel.add(companyCountField);

        String[] questions = {
            "Can you tell me about yourself?",
            "What are your strengths and weaknesses?",
            "Where do you see yourself in five years?",
            "How do you handle stress and pressure?",
            "Why you and not someone else?"
        };

        JButton finishInterviewBtn = new JButton("Finish Interview");
        finishInterviewBtn.setBackground(Color.BLACK);
        finishInterviewBtn.setForeground(Color.GREEN);
        interviewPanel.add(finishInterviewBtn);

        finishInterviewBtn.addActionListener(e -> {
            applicantScore = 0;

            if(q1Yes.isSelected()) applicantScore += 5;
            else applicantScore += 2;

            int companyCount = 0;
            try { companyCount = Integer.parseInt(companyCountField.getText()); } catch(Exception ex) {}

            for(int i=0; i<companyCount; i++) {
                String companyName = JOptionPane.showInputDialog(this, "Enter Company " + (i+1) + " Name:");
                String monthsStr = JOptionPane.showInputDialog(this, "Enter months worked at " + companyName + ":");
                int months = Integer.parseInt(monthsStr);

                if(months >= 24) applicantScore += 2;
                else applicantScore += 1;
            }

            for(String q : questions) {
                String scoreStr = JOptionPane.showInputDialog(this, q + " (Score 1 or 2):");
                int score = Integer.parseInt(scoreStr);
                applicantScore += score;
            }

            JOptionPane.showMessageDialog(this,
                "Interview Completed!\nTotal Score: " + applicantScore,
                "Interview Result", JOptionPane.INFORMATION_MESSAGE);

            if(applicantScore >= 15) {
            String applicantInfo = applicants.get(applicants.size()-1); 
            qualifiedApplicants.add(applicantInfo);
            JOptionPane.showMessageDialog(this,
                "Interview Completed!\nTotal Score: " + applicantScore +
                "\nApplicant Qualified!\n" + applicantInfo,
                "Interview Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String applicantInfo = applicants.remove(applicants.size()-1); 
            rejectedApplicants.add(applicantInfo + " (Rejected: Score < 15)");
            JOptionPane.showMessageDialog(this,
                "Interview Completed!\nTotal Score: " + applicantScore +
                "\nApplicant Rejected (Score < 15)\n" + applicantInfo,
                "Interview Result", JOptionPane.ERROR_MESSAGE);
        }
cardLayout.show(mainPanel, "menu");
        });

        mainPanel.add(interviewPanel, "interview");


        mainPanel.add(loginPanel, "login");
        mainPanel.add(menuPanel, "menu");
        mainPanel.add(applicantPanel, "applicant");
        mainPanel.add(agencyPanel, "service");
        mainPanel.add(jobPanel, "job");
        mainPanel.add(interviewPanel, "interview");
        mainPanel.add(deployPanel, "deploy");

        add(mainPanel);
        cardLayout.show(mainPanel, "login");
        setVisible(true);
    }

    private JLabel label(String text) {
        JLabel lbl = new JLabel(text);
        lbl.setForeground(Color.GREEN);
        return lbl;
    }

    public static void main(String[] args) {
        new RecruitmentSystemGUI();
    }
}