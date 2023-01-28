	import javax.swing.*; 
	import javax.swing.tree.DefaultMutableTreeNode; 
	public class TreeExample { 
	public static void main(String[] args) {
        JFrame f = new JFrame();  
 	 DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style"); 
 	 DefaultMutableTreeNode color=new DefaultMutableTreeNode("Color"); 
 	 DefaultMutableTreeNode font=new DefaultMutableTreeNode("Font"); 
  	 style.add(color); 
  	 style.add(font); 
  	DefaultMutableTreeNode red=new DefaultMutableTreeNode("red"); 
  	DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue"); 
  	 DefaultMutableTreeNode black=new DefaultMutableTreeNode("black"); 
  	DefaultMutableTreeNode green=new DefaultMutableTreeNode("green"); 
  	 color.add(red);
	 color.add(blue); 
	color.add(black);
	 color.add(green);   
  	DefaultMutableTreeNode font1=new DefaultMutableTreeNode("Times"); 
  	DefaultMutableTreeNode font2=new DefaultMutableTreeNode("Calibri");  
        font.add(font1);
        font.add(font2);
        JTree jt=new JTree(style); 
  	 f.add(jt); 
  	 f.setSize(200,200); 
 	 f.setVisible(true); 
}
}

  
