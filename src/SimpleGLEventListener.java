import com.sun.opengl.util.FPSAnimator;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGLEventListener extends JFrame implements GLEventListener , MouseMotionListener ,MouseListener{



    double count=0;
    boolean winner =false;
    boolean status =false;
    private int xPosition;
    private int yPosition;

    String Player="Player1";


    FPSAnimator animator;


    JButton Button=new JButton("New");

    int arr[][]=new int[3][3];





    SimpleGLEventListener(){


    }
    SimpleGLEventListener(int xPosition, int yPosition){
        this.xPosition=xPosition;
        this.yPosition=yPosition;

    }

    GLCanvas glc=new GLCanvas();







    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        GL gl = glAutoDrawable.getGL();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

        gl.glViewport(0, 0, 100, 100);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(0.0, 600.0, 0.0, 300.0, -1.0, 1.0);






    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        if(status==false){

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j]=0;
                }
            }

            status =true;
            count=0;
            xPosition=700;
            yPosition=700;

        }




        GL gl = glAutoDrawable.getGL();
        GL g = glAutoDrawable.getGL();

        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glPointSize(13.0f);

        gl.glColor3f(151/255f,154/255f,170/255f);

        gl.glBegin(GL.GL_QUADS);

        gl.glVertex2i(50,60);
        gl.glVertex2i(50,291);
        gl.glVertex2i(550,291);
        gl.glVertex2i(550,60);

        gl.glEnd();


        gl.glColor3f(1f,1f, 0f);
        gl.glPointSize(36.0f);

//line horizontal ,color black
        gl.glBegin(GL.GL_QUADS);
        for (int i = 166; i < 340; i=i+166) {

            gl.glVertex2i(50+i-5,60);
            gl.glVertex2i(50+i-5,290);
            gl.glVertex2i(50+i+5,290);
            gl.glVertex2i(50+i+5,60);

        } gl.glEnd();

        //line vertical ,color black
        gl.glBegin(GL.GL_QUADS);
        for (int i = 76; i < 160; i=i+76) {

            //((50<xPosition&&xPosition<210)&&(50<yPosition&&yPosition<120))
            gl.glVertex2i(50,60+i-3);
            gl.glVertex2i(550,60+i-3);
            gl.glVertex2i(550,60+i+3);
            gl.glVertex2i(50,60+i+3);

        } gl.glEnd();



        gl.glPointSize(5.0f);
        gl.glColor3f(1.0f,0.0f,0.0f);


        if(Player=="Player1"){

//excellent arr[0][0]
            if(((50<getxPosition()&&getxPosition()<210)&&(60<getyPosition()&&getyPosition()<130))&&(arr[0][0]==0) ){

                arr[0][0]=1;
                Player="Player2";
                count++;
            }
            //excellentarr[0][1]
            if(((220<getxPosition()&&getxPosition()<376)&&(60<getyPosition()&&getyPosition()<130))&&(arr[0][1]==0) ){

                arr[0][1]=1;
                Player="Player2";
                count++;
            }
            //excellentarr[0][2]
            if(((385<getxPosition()&&getxPosition()<550)&&(60<getyPosition()&&getyPosition()<130))&&(arr[0][2]==0) ){
                arr[0][2]=1;
                Player="Player2";
                count++;
            }

//excellentarr[1][0]
            if(((50<getxPosition()&&getxPosition()<210)&&(140<getyPosition()&&getyPosition()<210))&&(arr[1][0]==0) ){

                arr[1][0]=1;
                Player="Player2";
                count++;
            }

            //excellentarr[1][1]
            if(((220<getxPosition()&&getxPosition()<376)&&(140<getyPosition()&&getyPosition()<210))&&(arr[1][1]==0) ){

                arr[1][1]=1;
                Player="Player2";
                count++;
            }
            //excellentarr[1][2]
            if(((385<getxPosition()&&getxPosition()<550)&&(140<getyPosition()&&getyPosition()<210))&&(arr[1][2]==0) ){

                arr[1][2]=1;
                Player="Player2";
                count++;
            }

            if(((50<getxPosition()&&getxPosition()<210)&&(220<getyPosition()&&getyPosition()<290))&&(arr[2][0]==0) ){

                arr[2][0]=1;
                Player="Player2";
                count++;
            }

            //excellentarr[1][1]
            if(((220<getxPosition()&&getxPosition()<376)&&(220<getyPosition()&&getyPosition()<290))&&(arr[2][1]==0) ){

                arr[2][1]=1;
                Player="Player2";
                count++;
            }
            //excellentarr[1][2]
            if(((385<getxPosition()&&getxPosition()<550)&&(220<getyPosition()&&getyPosition()<290))&&(arr[2][2]==0) ){

                arr[2][2]=1;
                Player="Player2";
                count++;
            }

        }

        if(Player=="Player2"){

//excellent arr[0][0]
            if(((50<getxPosition()&&getxPosition()<210)&&(60<getyPosition()&&getyPosition()<130))&&(arr[0][0]==0) ){

                arr[0][0]=2;
                Player="Player1";
                count++;
            }

            //excellentarr[0][1]
            if(((220<getxPosition()&&getxPosition()<376)&&(60<getyPosition()&&getyPosition()<130))&&(arr[0][1]==0) ){

                arr[0][1]=2;
                Player="Player1";
                count++;
            }
            //excellentarr[0][2]
            if(((385<getxPosition()&&getxPosition()<550)&&(60<getyPosition()&&getyPosition()<130))&&(arr[0][2]==0) ){
                arr[0][2]=2;
                Player="Player1";
                count++;
            }

//excellentarr[1][0]
            if(((50<getxPosition()&&getxPosition()<210)&&(140<getyPosition()&&getyPosition()<210))&&(arr[1][0]==0) ){

                arr[1][0]=2;
                Player="Player1";
                count++;
            }

            //excellentarr[1][1]
            if(((220<getxPosition()&&getxPosition()<376)&&(140<getyPosition()&&getyPosition()<210))&&(arr[1][1]==0) ){

                arr[1][1]=2;
                Player="Player1";
                count++;
            }
            //excellentarr[1][2]
            if(((385<getxPosition()&&getxPosition()<550)&&(140<getyPosition()&&getyPosition()<210))&&(arr[1][2]==0) ){

                arr[1][2]=2;
                Player="Player1";
                count++;
            }

            if(((50<getxPosition()&&getxPosition()<210)&&(220<getyPosition()&&getyPosition()<290))&&(arr[2][0]==0) ){

                arr[2][0]=2;
                Player="Player1";
                count++;
            }

            //excellentarr[1][1]
            if(((220<getxPosition()&&getxPosition()<376)&&(220<getyPosition()&&getyPosition()<290))&&(arr[2][1]==0) ){

                arr[2][1]=2;
                Player="Player1";
                count++;
            }
            //excellentarr[1][2]
            if(((385<getxPosition()&&getxPosition()<550)&&(220<getyPosition()&&getyPosition()<290))&&(arr[2][2]==0) ){

                arr[2][2]=2;
                Player="Player1";
                count++;
            }

        }


         //--->draw game to x
        if(arr[0][0]==1&&count>0){
           drawX(gl,5,10,"blue");
           }
        if(arr[0][1]==1&&count>0){
            drawX(gl,172,10,"blue");
        }
        if(arr[0][2]==1&&count>0){
            drawX(gl,339,10,"blue");
        }
        if(arr[1][0]==1&&count>0){
            drawX(gl,0,85,"blue");
        }
        if(arr[1][1]==1&&count>0){
            drawX(gl,172,85,"blue");
        }
        if(arr[1][2]==1&&count>0){
            drawX(gl,339,85,"blue");
        }
        if(arr[2][0]==1&&count>0){
            drawX(gl,0,160,"blue");
        }
        if(arr[2][1]==1&&count>0){
            drawX(gl,172,160,"blue");
        }
        if(arr[2][2]==1&&count>0){
            drawX(gl,339,160,"blue");
        }


        //--->draw game to O
        if(arr[0][0]==2&&count>0){
            drawO(gl,5,10,"blue");
        }
        if(arr[0][1]==2&&count>0){
            drawO(gl,175,10,"blue");
        }
        if(arr[0][2]==2&&count>0){
            drawO(gl,339,10,"blue");
        }
        if(arr[1][0]==2&&count>0){
            drawO(gl,0,85,"blue");
        }
        if(arr[1][1]==2&&count>0){
            drawO(gl,172,85,"blue");
        }
        if(arr[1][2]==2&&count>0){
            drawO(gl,339,85,"blue");
        }
        if(arr[2][0]==2&&count>0){
            drawO(gl,0,160,"blue");
        }
        if(arr[2][1]==2&&count>0){
            drawO(gl,172,160,"blue");
        }
        if(arr[2][2]==2&&count>0){
            drawO(gl,339,160,"blue");
        }

        if(count>4&&winner==false) {


            for (int i = 0; i < 3; i++) {

                if (arr[i][0] == 1 && arr[i][1] == 1 && arr[i][2] == 1) {
                    winner = true;
                    System.out.println("Player 1 is winner");
                    break;
                }
                if (arr[0][i] == 1 && arr[1][i] == 1 && arr[2][i] == 1) {
                    winner = true;
                    System.out.println("Player 1 is winner");
                    break;
                }
                if (arr[i][0] == 2 && arr[i][1] == 2 && arr[i][2] == 2) {
                    winner = true;
                    System.out.println("Player 2 is winner");
                    break;
                }
                if (arr[0][i] == 2 && arr[1][i] == 2 && arr[2][i] == 2) {
                    winner = true;
                    System.out.println("Player 2 is winner");
                    break;
                }


            }
            if (arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1) {
                winner = true;
                System.out.println("Player 1 is Winner");
            }
            if (arr[2][0] == 1 && arr[1][1] == 1 && arr[0][2] == 1) {
                winner = true;
                System.out.println("Player 1 is Winner");
            }
            if (arr[0][0] == 2 && arr[1][1] == 2 && arr[2][2] == 2) {
                winner = true;
                System.out.println("Player 2 is Winner");
            }
            if (arr[2][0] == 2 && arr[1][1] == 2 && arr[0][2] == 2) {
                winner = true;
                System.out.println("Player 2 is Winner");
            }
            glc.repaint();

            if (winner == true && Player == "Player1") {

                Player = "Player1";
                int result = JOptionPane.showInternalConfirmDialog(null, "winner is Player2" + '\n' + "Do you want play again", "MESSAGE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == 0) {
                    status = true;
                    count = 0;
                    xPosition = 700;
                    yPosition = 700;
                    winner = false;
                    arr=new int[3][3];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            arr[i][j] = 0;

                        }
                    }
            }}
            if (winner == true && Player == "Player2") {

                Player = "Player1";
                int result = JOptionPane.showInternalConfirmDialog(null, "winner is Player1" + '\n' + "Do you want play again", "MESSAGE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == 0) {
                    status = true;
                    count = 0;
                    xPosition = 700;
                    yPosition = 700;
                    winner = false;
                    arr=new int[3][3];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            arr[i][j] = 0;

                        }
                    }
                }
                if (result == 1) {

                    System.exit(EXIT_ON_CLOSE);

                }


            }
        }


glc.repaint();
    }


    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }

    @Override
    public void displayChanged(GLAutoDrawable glAutoDrawable, boolean b, boolean b1) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {



    }

    @Override
    public void mouseClicked(MouseEvent e) {


        double x= e.getX();
        double y= e.getY();
        Component c=e.getComponent();
        int height =c.getHeight();
        int width =c.getWidth();

        xPosition=(int)((x/width)*600);
        yPosition=(int)((y/height)*300);
        yPosition=300-yPosition;

        setxPosition(xPosition);
        setyPosition(yPosition);

        glc.repaint();




    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setGLCanvas(GLCanvas glc){
        this.glc=glc;
    }


    public void drawX(GL gl,int xPoint1,int yPoint1, String color ){

//Draw Circle
        gl.glColor3f(1f,0f,0f);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex2d(70+xPoint1, 120+yPoint1);
        gl.glVertex2d(80+xPoint1, 100+yPoint1);
        gl.glVertex2d(180+xPoint1, 60+yPoint1);
        gl.glVertex2d(170+xPoint1, 80+yPoint1);
        gl.glEnd();

        gl.glBegin(GL.GL_QUADS);
        gl.glVertex2d(80+xPoint1, 80+yPoint1);
        gl.glVertex2d(70+xPoint1, 60+yPoint1);
        gl.glVertex2d(170+xPoint1, 100+yPoint1);
        gl.glVertex2d(180+xPoint1, 120+yPoint1);
        gl.glEnd();



    }
    public void drawO(GL gl,int xPoint1,int yPoint1 , String color){
        double x,y;


        gl.glPointSize(10.0f);
        gl.glColor3f(0.0f,1.0f,0.0f);
        gl.glBegin(GL.GL_POINTS);



        for
        (int ii = 0; ii < 360; ii++)
        {
            double theta = 2.0 * Math.PI * (ii) / (360);//get the current angle

            x =  30* Math.cos(theta);//calculate the x component
            y =  30* Math.sin(theta);//calculate the y component

            gl.glVertex2d(125+x+xPoint1, 90+y+yPoint1);//output vertex

        }
        gl.glEnd();

    }
}