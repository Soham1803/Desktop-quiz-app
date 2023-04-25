/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapp.ui.student;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import repositories.QuestionRepository;
import repositories.StudentRepository;
import services.QuestionService;
import services.StudentService;

public class TakeExam extends javax.swing.JFrame {

    private final  String username;
    private int myScore;
    private int currentQuestionNumber;
    private String currentAnswer;
    private int totalQuestions;
    private final QuestionService questionService;
    private final StudentService studentService;
    private List<Map<String, String>> questions;

    public TakeExam(String username) {
        initComponents();
        this.username = username;
        myScore = 0;
        currentQuestionNumber = 1;
        totalQuestions = 5;
        finishLabel.setVisible(false);
        finish.setVisible(false);
        scoreLabel.setVisible(false);
        score.setVisible(false);
        questionService = new QuestionRepository();
        questions = questionService.getRandomQuestions(totalQuestions);
        studentService = new StudentRepository();
        loadQuestion();
    }

    private void loadQuestion() {
        Map<String, String> currentQuestionMap = questions.get(currentQuestionNumber - 1);
        question.setText(currentQuestionMap.get("question"));
        optionA.setText(currentQuestionMap.get("optionA"));
        optionB.setText(currentQuestionMap.get("optionB"));
        optionC.setText(currentQuestionMap.get("optionC"));
        optionD.setText(currentQuestionMap.get("optionD"));
        currentAnswer = currentQuestionMap.get("answer");
    }

    private void loadNextQuestion() {
        if (answer.getSelectedItem().toString().equals(currentAnswer)) {
            myScore++;
        }
        if (currentQuestionNumber < totalQuestions) {
            currentQuestionNumber++;
            loadQuestion();
        } else {
            loadQuestion();
            displayScore();
        }
    }

    private void displayScore() {
        finishLabel.setVisible(true);
        finish.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        finishLabel = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        optionA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optionB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        optionC = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        optionD = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        answer = new javax.swing.JComboBox<>();
        finish = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(480*2, 360*2));
        setMinimumSize(new java.awt.Dimension(480*2, 360*2));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(480*2, 360*2));
        jPanel1.setMinimumSize(new java.awt.Dimension(480*2, 360*2));
        jPanel1.setLayout(null);

        finishLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        finishLabel.setForeground(new java.awt.Color(255, 255, 255));
        finishLabel.setText("Press finish button to finish the exam");
        jPanel1.add(finishLabel);
        finishLabel.setBounds(100, 710, 270, 20);

        question.setBackground(new java.awt.Color(0, 0, 0));
        question.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(question);
        question.setBounds(100, 90, 350, 100);

        optionA.setBackground(new java.awt.Color(0, 0, 0));
        optionA.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(optionA);
        optionA.setBounds(100, 240, 350, 50);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(A)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 220, 70, 20);

        optionB.setBackground(new java.awt.Color(0, 0, 0));
        optionB.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(optionB);
        optionB.setBounds(100, 320, 350, 50);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(B)");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 300, 70, 20);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Exam");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 10, 70, 30);

        optionC.setBackground(new java.awt.Color(0, 0, 0));
        optionC.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(optionC);
        optionC.setBounds(100, 400, 350, 50);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(C)");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 380, 70, 20);

        optionD.setBackground(new java.awt.Color(0, 0, 0));
        optionD.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(optionD);
        optionD.setBounds(100, 490, 350, 50);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("(D)");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 470, 70, 20);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Question");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 70, 70, 20);

        answer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        answer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d" }));
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });
        jPanel1.add(answer);
        answer.setBounds(100, 600, 340, 29);

        finish.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        finish.setForeground(new java.awt.Color(0, 0, 0));
        finish.setText("Finish");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        jPanel1.add(finish);
        finish.setBounds(100, 740, 340, 31);

        scoreLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("Score :");
        jPanel1.add(scoreLabel);
        scoreLabel.setBounds(100, 800, 50, 20);

        submit.setBackground(new java.awt.Color(51, 153, 0));
        submit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 0, 0));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(100, 640, 340, 31);

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Answer");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(100, 570, 70, 20);

        score.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(score);
        score.setBounds(70, 790, 70, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/ui/student/Quiz_app_bg.jpg"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 480*2, 360*2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        scoreLabel.setVisible(true);
        score.setVisible(true);
        score.setText("" + myScore);
        studentService.updateStudentMarks("a", "" + myScore);
    }//GEN-LAST:event_finishActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        loadNextQuestion();
    }//GEN-LAST:event_submitActionPerformed

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TakeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeExam("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> answer;
    private javax.swing.JLabel background;
    private javax.swing.JButton finish;
    private javax.swing.JLabel finishLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel optionA;
    private javax.swing.JLabel optionB;
    private javax.swing.JLabel optionC;
    private javax.swing.JLabel optionD;
    private javax.swing.JLabel question;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
