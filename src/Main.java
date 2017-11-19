import java.awt.* ;
import java.awt.event.* ;
import javax.swing.*;

class Main extends JFrame{
    int i = 0 ;
    int sprawdz = 0;
    JTextField t = new JTextField(20);
    JTextField t2 = new JTextField(5);
    JTextField t3 = new JTextField(5);
    JButton b1 = new JButton("przycisk 1") ;
    JButton b2 = new JButton("przycisk 2") ;
    JButton b3 = new JButton("przycisk 3") ;
    JButton b4 = new JButton("przycisk 4") ;

    Main(){
        setTitle("Przyciski");
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout()) ;
        cp.add(b1);
        cp.add(b2);
        cp.add(b3);
        cp.add(b4);
        cp.add(t) ;
        cp.add(t2);
        cp.add(t3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,200) ;
        setVisible(true) ;
        b1.addActionListener( new B1());
        b2.addActionListener( new B2());
        b3.addActionListener( new B3());
        b4.addActionListener( new B4());
        b1.setBackground(Color.green);
        b2.setBackground(Color.green);
        b3.setBackground(Color.green);
        b4.setBackground(Color.green);


    }

    class B1 implements ActionListener {
        int licznik = 0;
        public void actionPerformed(ActionEvent e) {
            t.setText("P1 - nieaktywny");
            b1.setEnabled(false);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            if(licznik%2 == 0){
                b1.setBackground(Color.yellow);
                licznik++;
                sprawdz++;
            }
            else {
                b1.setBackground(Color.green);
                licznik++;
                sprawdz--;
            }
            ++i;
            t2.setText(String.valueOf(i));
            t3.setText(String.valueOf(sprawdz));
            if(sprawdz==2) {
                if (b2.getBackground() == Color.yellow) {
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                }
                else if(b3.getBackground() == Color.yellow) {
                    b2.setEnabled(false);
                    b4.setEnabled(false);
                }
                else if(b4.getBackground() == Color.yellow) {
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                }
            }
        }
    }

    class B2 implements ActionListener {
        int licznik = 0;
        public void actionPerformed(ActionEvent e) {
            t.setText("P2 - nieaktywny");
            b1.setEnabled(true);
            b2.setEnabled(false);
            b3.setEnabled(true);
            b4.setEnabled(true);
            if(licznik%2 == 0){
                b2.setBackground(Color.yellow);
                licznik++;
                sprawdz++;
            }
            else {
                b2.setBackground(Color.green);
                licznik++;
                sprawdz--;
            }
            ++i;
            t2.setText(String.valueOf(i));
            t3.setText(String.valueOf(sprawdz));
            if(sprawdz==2) {
                if (b1.getBackground() == Color.yellow) {
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                } else if (b3.getBackground() == Color.yellow) {
                    b1.setEnabled(false);
                    b4.setEnabled(false);
                } else if (b4.getBackground() == Color.yellow) {
                    b1.setEnabled(false);
                    b3.setEnabled(false);
                }
            }
        }
    }

    class B3 implements ActionListener {
        int licznik = 0;
        public void actionPerformed(ActionEvent e) {
            t.setText("P3 - nieaktywny");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(false);
            b4.setEnabled(true);
            if (licznik % 2 == 0) {
                b3.setBackground(Color.yellow);
                licznik++;
                sprawdz++;
            } else {
                b3.setBackground(Color.green);
                licznik++;
                sprawdz--;
            }
            ++i;
            t2.setText(String.valueOf(i));
            t3.setText(String.valueOf(sprawdz));
            if (sprawdz == 2) {
                if (b1.getBackground() == Color.yellow) {
                    b2.setEnabled(false);
                    b4.setEnabled(false);
                } else if (b2.getBackground() == Color.yellow) {
                    b1.setEnabled(false);
                    b4.setEnabled(false);
                } else if (b4.getBackground() == Color.yellow) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                }

            }
        }
    }

    class B4 implements ActionListener {
        int licznik = 0;
        public void actionPerformed(ActionEvent e) {
            t.setText("P4 - nieaktywny");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(false);
            if (licznik % 2 == 0) {
                b4.setBackground(Color.yellow);
                licznik++;
                sprawdz++;
            } else {
                b4.setBackground(Color.green);
                licznik++;
                sprawdz--;
            }
            ++i;
            t2.setText(String.valueOf(i));
            t3.setText(String.valueOf(sprawdz));
            if (sprawdz == 2) {
                if (b1.getBackground() == Color.yellow) {
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                } else if (b2.getBackground() == Color.yellow) {
                    b3.setEnabled(false);
                    b1.setEnabled(false);
                } else if (b3.getBackground() == Color.yellow) {
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                }
            }
        }
    }

    public static void main(String[] arg){
        JFrame f = new Main();
    }
}





