/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author LENOVO
 */
public class menuCari_ENG extends javax.swing.JFrame {

    
    private Data[] hashArray;
    private int size = 150;
    /**
     * Creates new form menuUtama
     */
    public menuCari_ENG() {
        hashArray = new Data[size]; 
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void insert(String key,String value) 
    {
        Data item = new Data(key, value);
        key = item.getKey();
        int hashval = hashFunc(key);
        while(hashArray[hashval] != null){
            ++hashval;
            hashval %= size;
        }
        hashArray[hashval] = item;
    } 
    
    public boolean containsKey(String key)
    {
        int hashVal=hashFunc(key);
        while(hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey().equalsIgnoreCase(key)) {
                return true;
            }
            ++hashVal;
            hashVal %= size;
        }
        return false;
    }
    
    public String get(String key) {
       
        int hashVal=hashFunc(key);
        while(hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey().equalsIgnoreCase(key)) {
                return hashArray[hashVal].getValue();
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }
 
    public int hashFunc(String key)
    {  
        int index = key.hashCode();
        return Math.abs(index) % hashArray.length;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCari = new javax.swing.JTextField();
        btBahasa = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btDaftarKata1 = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btInformasi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btCariAtas1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCari.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtCari.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 360, 30));

        btBahasa.setContentAreaFilled(false);
        btBahasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBahasaMouseClicked(evt);
            }
        });
        btBahasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBahasaActionPerformed(evt);
            }
        });
        getContentPane().add(btBahasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, 40));

        btExit.setContentAreaFilled(false);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 40));

        btDaftarKata1.setContentAreaFilled(false);
        btDaftarKata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDaftarKata1ActionPerformed(evt);
            }
        });
        getContentPane().add(btDaftarKata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 110, 40));

        btHapus.setContentAreaFilled(false);
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 40, 50));

        btInformasi.setContentAreaFilled(false);
        btInformasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformasiActionPerformed(evt);
            }
        });
        getContentPane().add(btInformasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 80, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 450, 280));

        btCariAtas1.setBackground(new java.awt.Color(255, 255, 255));
        btCariAtas1.setContentAreaFilled(false);
        btCariAtas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariAtas1ActionPerformed(evt);
            }
        });
        getContentPane().add(btCariAtas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 50, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cari ENG.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btBahasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBahasaActionPerformed
        // TODO add your handling code here:
        new Bahasa_ENG().setVisible(true);
        dispose();
    }//GEN-LAST:event_btBahasaActionPerformed

    private void btDaftarKata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDaftarKata1ActionPerformed
        // TODO add your handling code here:
        new DaftarKata_ENG().setVisible(true);
        dispose();
    }//GEN-LAST:event_btDaftarKata1ActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        txtCari.setText("");
        txtArea.setText("");
    }//GEN-LAST:event_btHapusActionPerformed

    private void btInformasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformasiActionPerformed
        // TODO add your handling code here:
        new Informasi_ENG().setVisible(true);
        dispose();
    }//GEN-LAST:event_btInformasiActionPerformed

    private void btBahasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBahasaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btBahasaMouseClicked

    private void btCariAtas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariAtas1ActionPerformed
        // TODO add your handling code here:
        String key = txtCari.getText();
        menuCari_ENG in = new menuCari_ENG();
        
        in.insert("abstract class","original class (without object) and must \nnot have objects (no instantion) and abstract methods must be \nrefined by derivative classes through override");
        in.insert("AI","Artificial Intelligence is the science that develops \ncomputers to be able to work and think and make \ndecisions like humans.");
        in.insert("algorithm","A set of commands or steps used by programmers to execute a command.");
        in.insert("ALU","Arithmetic and Logical Unit is a part of the CPU that \nis useful for processing data logically and also \ndata that requires calculations.");
        in.insert("API","An API or Application Programming Interface is a system or \nprotocol and tool that blocks software \napplications that run behind the scenes.");
        in.insert("argument","designation for the input value of a function when a function is called");
        in.insert("array","A variable that can store a lot of data in a single variable");
        in.insert("array multidimensional ","A variable that stores a set of data \nthat has the same type and elements that will \nbe accessed through many indexes or subscripts");
        in.insert("ascending","sequence of data arranged from lowest to highest");
        in.insert("attribute","Data contained in a class");
        in.insert("Back-End Developer","Programmers are responsible for taking care of \nthe back side or 'server side' because \nit runs on the website server and not on the user's computer.");
        in.insert("behaviour","Things that objects of a class can do");
        in.insert("binary tree ","a data structure tree where each node has a maximum of two children");
        in.insert("bit","The smallest size of information");
        in.insert("boolean","A data that has two values, True and False, \nbut when translated into integer form (programming) \nhas a value of 1 for true 0 for false        ");
        in.insert("break","command to stop the program");
        in.insert("browser","software to open the website page");
        in.insert("bubble sort","Algorithm sequencing method by exchanging \ndata continuously until it can be ascertained in \na certain iteration there are no more changes / exchanges. This algorithm uses comparisons in operations between its elements.");
        in.insert("char","single character data types commonly defined by quotation \nmarks (') at the beginning and at \nthe end of the character");
        in.insert("class","Blueprints or blueprints of objects are used \nonly to create a basic framework.");
        in.insert("client","the computer in charge of receiving data \nand information that has been processed by the server");
        in.insert("coding ","program writing");
        in.insert("compare","Compare and Choose");
        in.insert("compute","Perform arithmetic calculations");
        in.insert("connect","connecting a computer to a network");
        in.insert("data","a collection of facts representing an object");
        in.insert("database", "A set of electronic data or information that has been \narranged in such a way in a web server with certain provisions or rules that are related to each other.");
        in.insert("delete", "        delete data");
        in.insert("descending", "sequence of data from highest to lowest value");
        in.insert("display", "output from the computer");
        in.insert("domain","address on the internet or as a country pointer of \nthe website used");
        in.insert("double","Double type has a double level of accuracy or double \nprecision by using 64-bit storage space in storing its value");
        in.insert("encapsulation","The concept of binding different data or methods \nthat are put together or 'encapsulated' into a single unit of data.");
        in.insert("encode", "preparing a program into machine language to be processed \nimmediately by a computer");
        in.insert("error","indicates that there is an error in the program code");
        in.insert("field","A collection of characters that make up a meaning");
        in.insert("FIFO","It stands for First In First Out, meaning that the data is \nfirst entered or stored, then the data is the first \nto be accessed or released.");
        in.insert("float", "used to mark precision values such as single precision by \nusing 32-bit storage");
        in.insert("flowchart", "A flowchart is a diagram that displays the steps and \ndecisions to perform a process from a program.");
        in.insert("Front-End Developer","programmers who are responsible for \ntaking care of the front side to adjust the look, feel, \nbehavior of the website, to the user interface which \nincludes weaning colors, fonts, to dropdown shapes");
        in.insert("Full Stack Developer", "work in the gray zone where it can \nwork cross-functionally on two different technologies, \nfront-end and back-end, and Full-Stack Developer \noffers a complete package");
        in.insert("graph","a collection of interconnected knots and arcs ");
        in.insert("gui", "A graphical interface that has window elements, icons, and menus. \nWindows has a number of parts, from desktop to taskbar");
        in.insert("hash table ","data structures used in temporary data storage and \ncan speed up the search for stored data");
        in.insert("heaps","A binary tree that has characteristics: \nthe binary tree on the heap is a complete tree, implemented as an array rather \nthan using references to connect each node, and the \nnodes on a heap meet the heap conditions.");
        in.insert("homepage","the main page of a website");
        in.insert("HTML","HTML stands for Hypertext Markup Language, which is the \nstandard markup language for creating and composing web pages and applications.");
        in.insert("infix", "how to write a phrase by placing the operator between \ntwo operands accompanied by parentheses");
        in.insert("informatic engineering","One of the tertiary education majors \nthat studies and applies the principles of computer science and mathematical analysis in the design, testing, development, \nand evaluation of operating systems, software, and computer performance.");
        in.insert("inheritance", "the ability to form new classes that have derived \nfunctions or are similar to existing functions");
        in.insert("input","Read data");
        in.insert("insert","enter data");
        in.insert("insertion sort","a sorting algorithm that compares the first two \ndata elements, sorts them, then checks the next data elements \none by one and compares them with the data elements that have been sorted. \nBecause this algorithm works by comparing data elements to be sorted, \nthis algorithm is also included in comparison-based sort");
        in.insert("instance","the formation of a class into a known object");
        in.insert("integer","numeric data type commonly used when dealing with integers");
        in.insert("IP","Internet Protocol is a protocol that operates in different parts");
        in.insert("ISP","Internet Server Provider is a company that sells \ninternet connections to customers");
        in.insert("iteration", "a sequence or more of algorithmic steps performed in the program loop");
        in.insert("JavaScript","a programming language that is Client Side Programming \nLanguage that can run on all web browsers");
        in.insert("jQuery", "a collection of JavaScript functions that make it easy to \nwrite JavaScript code or a JavaScript library");
        in.insert("LED","a small lamp used for a marker or pointer");
        in.insert("LIFO","stands for Last In First Out, meaning that the data was \nlast entered or stored, then the data is the first \nto be accessed or issued");
        in.insert("linked list","a form of data structure, containing a collection \nof data (nodes) arranged sequentially, interconnected, dynamic and unlimited");
        in.insert("long","used when the value is outside the capacity of the int type \nrange because the long type has a very high range compared to other data types");
        in.insert("loop","Doing repetition");
        in.insert("merge sort","sorting data by combining until the data is sorted");
        in.insert("method","a function that contains actions that can be performed inside a class");
        in.insert("object","printout from class");
        in.insert("oop","OOP (Object Oriented Programming) is an object-oriented programming method");
        in.insert("operator","a symbol used to give commands to the computer to take \naction on one or more operands. The operand itself is something that is operated \nby the operator");
        in.insert("output","Show data");
        in.insert("overloading","create multiple methods with the same name, \nbut different by the number and/or type of parameters");
        in.insert("package","directory to store bytecode files (files with extension .class)");
        in.insert("parameter","designation for the function input value when a function is defined");
        in.insert("peek","function to see the data that is on the stack");
        in.insert("polymorphism","the concept in which different objects can be accessed through \nthe same interface or in other terms applying the same method \nbut producing different behavior");
        in.insert("pop","function to remove or delete the last value \n(which is at the topmost position) from the stack");
        in.insert("postfix","how to write an expression by putting \nthe operator after the operand without writing brackets");
        in.insert("program language","A set of instructions given \nto a computer to be able to perform certain \ntasks in solving a problem.");
        in.insert("Programming Language","Standard instructions for commanding a computer");
        in.insert("pseudocode","code that describes an algorithm \nwritten in a simpler and more free way because it is not tied to a \nparticular programming language");
        in.insert("push","serves to insert a value or data into the stack and queue");
        in.insert("queues","is a linear data structure where the addition of \ncomponents is done at one end, while subtraction is done at the other end");
        in.insert("quick sort","sort data by dividing data into partitions and using pivot");
        in.insert("RAM","a computer hardware device in the form of a memory \nmodule that serves to temporarily store data");
        in.insert("recursion","method that calls itself");
        in.insert("remove","delete existing data in an array or list");
        in.insert("return","keyword to return a value in a function");
        in.insert("selection sort","is a simple sorting algorithm. \nThe basic idea is to perform multiple passes to select data structure elements. \nFor ascending sorting, the smallest element among the unsorted elements, its index is stored, then the value of the element with the stored index is exchanged with the first unsorted element.");
        in.insert("sequence","is the order of execution from the first command/statement to the last command/statement");
        in.insert("shell sort","sorting data by comparing a \ndata with other data that has a certain distance");
        in.insert("sorting object","Sort an object into ordered data");
        in.insert("stacks","A stack can be interpreted as a collection of data \nthat looks as if there is data placed on top of other data");
        in.insert("store","Assigning a value to an identifier");
        in.insert("strings","a data type that holds a character set \nthat must be enclosed in double quotes");
        in.insert("subclass","class that inherits properties from superclass");
        in.insert("superclass","class that inherits its attributes and methods to subclasses");
        in.insert("updates","updating existing data");
        in.insert("URL","Uniform Resource Locator is a way of \nembedding file addresses on the internet");
        in.insert("website","a collection of pages on one domain \non the internet that can be accessed using a browser");
        
        if(in.containsKey(key))
        {
            txtArea.setText(in.get(key)); 
        }
        else
        {
            txtArea.setText("the word not ");
        }
        
    }//GEN-LAST:event_btCariAtas1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuCari_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuCari_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuCari_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuCari_ENG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuCari_ENG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btBahasa;
    private javax.swing.JButton btCariAtas1;
    private javax.swing.JButton btDaftarKata1;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btInformasi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}
