import javax.media.opengl.GL;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleJoglApp extends JFrame implements ActionListener {


JButton jButton=new JButton("New");

JPanel jPanel1=new JPanel();
JPanel jPanel2=new JPanel();
    SimpleGLEventListener s1=new SimpleGLEventListener();
    SimpleJoglApp(){
        super("XOGAME");
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        GLCanvas glCanvas=new GLCanvas();
        glCanvas.setSize(1200,1200);
        glCanvas.addGLEventListener(new SimpleGLEventListener());

        glCanvas.addGLEventListener(s1);
        glCanvas.addMouseListener(s1);
        glCanvas.addMouseMotionListener(s1);
        s1.setGLCanvas(glCanvas);

jPanel1.add(glCanvas);
jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
jPanel2.add(s1.Button);
        this.setLayout(null);
        add(jPanel1);
        add(jPanel2);



        jPanel2.setLayout(null);
        jPanel1.setBounds(0,-30,1200,950);
        jPanel2.setBounds(0,920,1200,100);
        jPanel2.setBackground(Color.black);
jPanel2.add(s1.Button);
        s1.Button.setBackground(Color.lightGray);
        s1.Button.setForeground(Color.black);
s1.Button.setBounds(500,0,200,60);
s1.Button.setFocusTraversalKeysEnabled(true);
s1.Button.setFocusable(true);
s1.Button.addActionListener(this);


        setSize(1200,1300);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==s1.Button){

            System.out.println("buttttton" );
            JOptionPane.showInternalConfirmDialog(null,"Do you want play again ?","MESSAGE",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           s1.status=false;
           s1.Player="Player1";
            s1.count=0;
            s1.winner =false;
            s1.status =false;

        }
    }
}
