/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class DaftarKata_ENG extends javax.swing.JFrame {

    public String insert(String data)
    { 
         return data;
    }
    
    private void show_data() {
        
        try {
            DefaultTableModel dataModel = (DefaultTableModel) tabelDaftarkata.getModel();
            DaftarKata kata= new DaftarKata();
            tabelDaftarkata.setAutoCreateColumnsFromModel(true);
            
            dataModel.addRow(new Object[]{ 1,"abstract class",kata.insert("original class (without object) and must not have objects (no instantion) and abstract methods must be refined by derivative classes through override")});
            dataModel.addRow(new Object[]{ 2,"AI",kata.insert("Artificial Intelligence is the science that develops computers to be able to work and think and make decisions like humans")});
            dataModel.addRow(new Object[]{ 3,"algorithm",kata.insert("A set of commands or steps used by programmers to execute a command")});
            dataModel.addRow(new Object[]{ 4,"ALU",kata.insert("Arithmetic and Logical Unit is a part of the CPU that is useful for processing data logically and also data that requires calculations")});
            dataModel.addRow(new Object[]{ 5,"API",kata.insert("An API or Application Programming Interface is a system or protocol and tool that blocks software applications that run behind the scenes")});
            dataModel.addRow(new Object[]{ 6,"argument",kata.insert("designation for the input value of a function when a function is called")});
            dataModel.addRow(new Object[]{ 7,"array",kata.insert("A variable that can store a lot of data in a single variable")});
            dataModel.addRow(new Object[]{ 8,"array multidimensional ",kata.insert("A variable that stores a set of data that has the same type and elements that will be accessed through many indexes or subscripts")});
            dataModel.addRow(new Object[]{ 9,"ascending",kata.insert("sequence of data arranged from lowest to highest")});
            dataModel.addRow(new Object[]{ 10,"attribute",kata.insert("Data contained in a class")});
            dataModel.addRow(new Object[]{ 11,"Back-End Developer",kata.insert("Programmers are responsible for taking care of the back side or 'server side' because it runs on the website server and not on the user's computer")});
            dataModel.addRow(new Object[]{ 12,"behaviour",kata.insert("Things that objects of a class can do")});
            dataModel.addRow(new Object[]{ 13,"binary tree ",kata.insert("a data structure tree where each node has a maximum of two children")});
            dataModel.addRow(new Object[]{ 14,"bit",kata.insert("The smallest size of information")});
            dataModel.addRow(new Object[]{ 15,"boolean",kata.insert("A data that has two values, True and False, but when translated into integer form (programming) has a value of 1 for true 0 for false")});
            dataModel.addRow(new Object[]{ 16,"break",kata.insert("command to stop the program")});
            dataModel.addRow(new Object[]{ 17,"browser",kata.insert("software to open the website page")});
            dataModel.addRow(new Object[]{ 18,"bubble sort",kata.insert("Algorithm sequencing method by exchanging data continuously until it can be ascertained in a certain iteration there are no more changes / exchanges. This algorithm uses comparisons in operations between its elements")});
            dataModel.addRow(new Object[]{ 19,"char",kata.insert("single character data types commonly defined by quotation marks (') at the beginning and at the end of the character")});
            dataModel.addRow(new Object[]{ 20,"class",kata.insert("Blueprints or blueprints of objects are used only to create a basic framework")});
            dataModel.addRow(new Object[]{ 21,"client ",kata.insert("the computer in charge of receiving data and information that has been processed by the server")});
            dataModel.addRow(new Object[]{ 22,"coding ",kata.insert("program writing")});
            dataModel.addRow(new Object[]{ 23,"compare",kata.insert("Compare and Choose")});
            dataModel.addRow(new Object[]{ 24,"compute",kata.insert("Perform arithmetic calculations")});
            dataModel.addRow(new Object[]{ 25,"connect",kata.insert("connecting a computer to a network")});
            dataModel.addRow(new Object[]{ 26,"data",kata.insert("a collection of facts representing an object")});
            dataModel.addRow(new Object[]{ 27,"database",kata.insert("A set of electronic data or information that has been arranged in such a way in a web server with certain provisions or rules that are related to each other")});
            dataModel.addRow(new Object[]{ 28,"delete",kata.insert("delete data")});
            dataModel.addRow(new Object[]{ 29,"descending",kata.insert("sequence of data from highest to lowest value")});
            dataModel.addRow(new Object[]{ 30,"display",kata.insert("output from the computer")});
            dataModel.addRow(new Object[]{ 31,"domain",kata.insert("address on the internet or as a country pointer of the website used ")});
            dataModel.addRow(new Object[]{ 32,"double",kata.insert("Double type has a double level of accuracy or double precision by using 64-bit storage space in storing its value")});
            dataModel.addRow(new Object[]{ 33,"encapsulation",kata.insert("The concept of binding different data or methods that are put together or 'encapsulated' into a single unit of data")});
            dataModel.addRow(new Object[]{ 34,"encode",kata.insert("preparing a program into machine language to be processed immediately by a computer")});
            dataModel.addRow(new Object[]{ 35,"error",kata.insert("indicates that there is an error in the program code")});
            dataModel.addRow(new Object[]{ 36,"field",kata.insert("A collection of characters that make up a meaning")});
            dataModel.addRow(new Object[]{ 37,"FIFO",kata.insert("It stands for First In First Out, meaning that the data is first entered or stored, then the data is the first to be accessed or released")});
            dataModel.addRow(new Object[]{ 38,"float",kata.insert("used to mark precision values such as single precision by using 32-bit storage")});
            dataModel.addRow(new Object[]{ 39,"flowchart",kata.insert("A flowchart is a diagram that displays the steps and decisions to perform a process from a program")});
            dataModel.addRow(new Object[]{ 40,"Front-End Developer",kata.insert("programmers who are responsible for taking care of the front side to adjust the look, feel, behavior of the website, to the user interface which includes weaning colors, fonts, to dropdown shapes")});
            dataModel.addRow(new Object[]{ 41,"Full Stack Developer",kata.insert("work in the gray zone where it can work cross-functionally on two different technologies, front-end and back-end, and Full-Stack Developer offers a complete package")});
            dataModel.addRow(new Object[]{ 42,"graph",kata.insert("a collection of interconnected knots and arcs")});
            dataModel.addRow(new Object[]{ 43,"gui",kata.insert("A graphical interface that has window elements, icons, and menus. Windows has a number of parts, from desktop to taskbar")});
            dataModel.addRow(new Object[]{ 44,"hash table ",kata.insert("data structures used in temporary data storage and can speed up the search for stored data")});
            dataModel.addRow(new Object[]{ 45,"heaps",kata.insert("A binary tree that has characteristics: the binary tree on the heap is a complete tree, implemented as an array rather than using references to connect each node, and the nodes on a heap meet the heap conditions")});
            dataModel.addRow(new Object[]{ 46,"homepage",kata.insert("the main page of a website")});
            dataModel.addRow(new Object[]{ 47,"HTML",kata.insert("HTML stands for Hypertext Markup Language, which is the standard markup language for creating and composing web pages and applications")});
            dataModel.addRow(new Object[]{ 48,"infix",kata.insert("how to write a phrase by placing the operator between two operands accompanied by parentheses")});
            dataModel.addRow(new Object[]{ 49,"informatic engineering",kata.insert("One of the tertiary education majors that studies and applies the principles of computer science and mathematical analysis in the design, testing, development, and evaluation of operating systems, software, and computer performance")});
            dataModel.addRow(new Object[]{ 50,"inheritance",kata.insert("the ability to form new classes that have derived functions or are similar to existing functions")});
            dataModel.addRow(new Object[]{ 51,"input",kata.insert("Read data")});
            dataModel.addRow(new Object[]{ 52,"insert",kata.insert("enter data")});
            dataModel.addRow(new Object[]{ 53,"insertion sort",kata.insert("a sorting algorithm that compares the first two data elements, sorts them, then checks the next data elements one by one and compares them with the data elements that have been sorted. Because this algorithm works by comparing data elements to be sorted, this algorithm is also included in comparison-based sort")});
            dataModel.addRow(new Object[]{ 54,"instance",kata.insert("the formation of a class into a known object")});
            dataModel.addRow(new Object[]{ 55,"integer",kata.insert("numeric data type commonly used when dealing with integers")});
            dataModel.addRow(new Object[]{ 56,"IP",kata.insert("Internet Protocol is a protocol that operates in different parts")});
            dataModel.addRow(new Object[]{ 57,"ISP",kata.insert("Internet Server Provider is a company that sells internet connections to customers")});
            dataModel.addRow(new Object[]{ 58,"iteration",kata.insert("a sequence or more of algorithmic steps performed in the program loop")});
            dataModel.addRow(new Object[]{ 59,"JavaScript",kata.insert("a programming language that is Client Side Programming Language that can run on all web browsers")});
            dataModel.addRow(new Object[]{ 60,"jQuery",kata.insert("a collection of JavaScript functions that make it easy to write JavaScript code or a JavaScript library")});
            dataModel.addRow(new Object[]{ 61,"LED",kata.insert("a small lamp used for a marker or pointer")});
            dataModel.addRow(new Object[]{ 62,"LIFO",kata.insert("stands for Last In First Out, meaning that the data was last entered or stored, then the data is the first to be accessed or issued")});
            dataModel.addRow(new Object[]{ 63,"linked list",kata.insert("a form of data structure, containing a collection of data (nodes) arranged sequentially, interconnected, dynamic and unlimited")});
            dataModel.addRow(new Object[]{ 64,"long",kata.insert("used when the value is outside the capacity of the int type range because the long type has a very high range compared to other data types")});
            dataModel.addRow(new Object[]{ 65,"loop",kata.insert("Doing repetition")});
            dataModel.addRow(new Object[]{ 66,"merge sort",kata.insert("sorting data by combining until the data is sorted")});
            dataModel.addRow(new Object[]{ 67,"method",kata.insert("a function that contains actions that can be performed inside a class")});
            dataModel.addRow(new Object[]{ 68,"object",kata.insert("printout from class")});
            dataModel.addRow(new Object[]{ 69,"oop",kata.insert("OOP (Object Oriented Programming) is an object-oriented programming method")});
            dataModel.addRow(new Object[]{ 70,"operator",kata.insert("a symbol used to give commands to the computer to take action on one or more operands. The operand itself is something that is operated by the operator")});
            dataModel.addRow(new Object[]{ 71,"output",kata.insert("Show data")});
            dataModel.addRow(new Object[]{ 72,"overloading",kata.insert("create multiple methods with the same name, but different by the number and/or type of parameters")});
            dataModel.addRow(new Object[]{ 73,"package",kata.insert("directory to store bytecode files (files with extension .class)")});
            dataModel.addRow(new Object[]{ 74,"parameter",kata.insert("designation for the function input value when a function is defined")});
            dataModel.addRow(new Object[]{ 75,"peek",kata.insert("function to see the data that is on the stack")});
            dataModel.addRow(new Object[]{ 76,"polymorphism",kata.insert("the concept in which different objects can be accessed through the same interface or in other terms applying the same method but producing different behavior")});
            dataModel.addRow(new Object[]{ 77,"pop",kata.insert("function to remove or delete the last value (which is at the topmost position) from the stack")});
            dataModel.addRow(new Object[]{ 78,"postfix",kata.insert("how to write an expression by putting the operator after the operand without writing brackets")});
            dataModel.addRow(new Object[]{ 79,"program language",kata.insert("A set of instructions given to a computer to be able to perform certain tasks in solving a problem")});
            dataModel.addRow(new Object[]{ 80,"Programming Language",kata.insert("Standard instructions for commanding a computer")});
            dataModel.addRow(new Object[]{ 81,"pseudocode",kata.insert("code that describes an algorithm written in a simpler and more free way because it is not tied to a particular programming language")});
            dataModel.addRow(new Object[]{ 82,"push",kata.insert("serves to insert a value or data into the stack and queue")});
            dataModel.addRow(new Object[]{ 83,"queues",kata.insert("is a linear data structure where the addition of components is done at one end, while subtraction is done at the other end")});
            dataModel.addRow(new Object[]{ 84,"quick sort",kata.insert("sort data by dividing data into partitions and using pivot")});
            dataModel.addRow(new Object[]{ 85,"RAM",kata.insert("a computer hardware device in the form of a memory module that serves to temporarily store data")});
            dataModel.addRow(new Object[]{ 86,"recursion",kata.insert("method that calls itself")});
            dataModel.addRow(new Object[]{ 87,"remove",kata.insert("delete existing data in an array or list")});
            dataModel.addRow(new Object[]{ 88,"return",kata.insert("keyword to return a value in a function")});
            dataModel.addRow(new Object[]{ 89,"selection sort",kata.insert("is a simple sorting algorithm. The basic idea is to perform multiple passes to select data structure elements. For ascending sorting, the smallest element among the unsorted elements, its index is stored, then the value of the element with the stored index is exchanged with the first unsorted element")});
            dataModel.addRow(new Object[]{ 90,"sequence",kata.insert("is the order of execution from the first command/statement to the last command/statement")});
            dataModel.addRow(new Object[]{ 91,"shell sort",kata.insert("sorting data by comparing a data with other data that has a certain distance")});
            dataModel.addRow(new Object[]{ 92,"sorting object",kata.insert("Sort an object into ordered data")});
            dataModel.addRow(new Object[]{ 93,"stacks",kata.insert("A stack can be interpreted as a collection of data that looks as if there is data placed on top of other data")});
            dataModel.addRow(new Object[]{ 94,"store",kata.insert("Assigning a value to an identifier")});
            dataModel.addRow(new Object[]{ 95,"strings",kata.insert("a data type that holds a character set that must be enclosed in double quotes ")});
            dataModel.addRow(new Object[]{ 96,"subclass",kata.insert("class that inherits properties from superclass")});
            dataModel.addRow(new Object[]{ 97,"superclass",kata.insert("class that inherits its attributes and methods to subclasses")});
            dataModel.addRow(new Object[]{ 98,"updates",kata.insert("updating existing data")});
            dataModel.addRow(new Object[]{ 99,"URL",kata.insert("Uniform Resource Locator is a way of embedding file addresses on the internet")});
            dataModel.addRow(new Object[]{ 100,"website",kata.insert("a collection of pages on one domain on the internet that can be accessed using a browser")});
        
        } catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
    /**
     * Creates new form DaftarKata
     */
    public DaftarKata_ENG() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btShow = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btBahasa = new javax.swing.JButton();
        btInformasi = new javax.swing.JButton();
        btCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDaftarkata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btShow.setContentAreaFilled(false);
        btShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowActionPerformed(evt);
            }
        });
        getContentPane().add(btShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 160, 40));

        btExit.setContentAreaFilled(false);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 40));

        btBahasa.setContentAreaFilled(false);
        btBahasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBahasaActionPerformed(evt);
            }
        });
        getContentPane().add(btBahasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, 40));

        btInformasi.setContentAreaFilled(false);
        btInformasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformasiActionPerformed(evt);
            }
        });
        getContentPane().add(btInformasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 80, 40));

        btCari.setContentAreaFilled(false);
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });
        getContentPane().add(btCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 90, 40));

        tabelDaftarkata.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabelDaftarkata.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        tabelDaftarkata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kata", "Makna"
            }
        ));
        tabelDaftarkata.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tabelDaftarkata);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 760, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Daftar ENG.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
        new menuCari_ENG().setVisible(true);
        dispose();
    }//GEN-LAST:event_btCariActionPerformed

    private void btBahasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBahasaActionPerformed
        // TODO add your handling code here:
        new Bahasa_ENG().setVisible(true);
        dispose();
    }//GEN-LAST:event_btBahasaActionPerformed

    private void btInformasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformasiActionPerformed
        // TODO add your handling code here:
        new Informasi_ENG().setVisible(true);
        dispose();
    }//GEN-LAST:event_btInformasiActionPerformed

    private void btShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowActionPerformed
        // TODO add your handling code here:
        show_data();
    }//GEN-LAST:event_btShowActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarKata_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarKata_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarKata_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarKata_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarKata_ENG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBahasa;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btInformasi;
    private javax.swing.JButton btShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDaftarkata;
    // End of variables declaration//GEN-END:variables
}
