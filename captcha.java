import java.awt.image.*;
import java.util.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
class captcha
{
public static void main(String gi[])
{
int height=50;
int width=150;
Dimension imgDim = new Dimension(200,200);
String captcha= UUID.randomUUID().toString().substring(0,7);
BufferedImage  bi= new BufferedImage(150,50,BufferedImage.TYPE_INT_RGB);
Graphics2D graphics= bi.createGraphics();
Font font = new Font("Verdana", Font.BOLD, 18);
graphics.setFont(font);
GradientPaint gp = new GradientPaint(0, 0, Color.lightGray, 0, height / 5, Color.WHITE, true);
graphics.setPaint(gp);
graphics.fillRect(0, 0, width, height);
graphics.setColor(new Color(0,0,0));
Random r = new Random();
 int x = 0;
int y = 0;
char []captain=captcha.toCharArray();
for (int i = 0; i < captain.length; i++) 
{
x += 10 + (Math.abs(r.nextInt()) % 15);
y = 20 + Math.abs(r.nextInt()) % 20;
graphics.drawChars(captain, i, 1, x, y);
}
graphics.drawLine((r.nextInt()) % 30,(r.nextInt()) % 8, (width+50)/15*3,imgDim.height-25);
graphics.drawLine((r.nextInt()) % 15,(r.nextInt()) % 40, (width+50)/15*6,imgDim.height-25);

graphics.dispose();
try
{
ImageIO.write(bi, "jpg", new File("C://del/captain.png"));
}catch(Exception e)
{
System.out.println("Error in writing image file");
}
}
}   