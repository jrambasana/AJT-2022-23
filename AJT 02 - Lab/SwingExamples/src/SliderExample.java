import javax.swing.*; 
public class SliderExample extends JFrame{ 
public static void main(String s[]) { 
SliderExample ss = new SliderExample();
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25); 
slider.setMinorTickSpacing(2); 
slider.setMajorTickSpacing(10); 
slider.setPaintTicks(true); 
slider.setPaintLabels(true); 
JPanel panel=new JPanel(); 
panel.add(slider); 
ss.add(panel); 
ss.setSize(300, 300);
ss.setVisible(true); 
} 
} 
