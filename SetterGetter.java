import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.lang.reflect.*;

class GenerateSetterGetter {
    public static void main(String gg[]) {
        String className = gg[0];
        try {
            Class c = Class.forName(className);
            String name;
            String type;
            String line;
            String name1;
            Field[] fields = c.getDeclaredFields();
            StringBuffer sb = new StringBuffer();
            for (Field f : fields) {
                name = setterName(f);
                name1 = f.getName();
                type = f.getType().getSimpleName();
                line = "public void" + " " + name + "(" + type + " " + name1 + ")\r\n";
                sb.append(line);
                line = "{\r\n";
                sb.append(line);
                line = "this." + name1 + "=" + name1 + ";\r\n";
                sb.append(line);
                line = "}\r\n";
                sb.append(line);
                name = getterName(f);
                name1 = f.getName();
                type = f.getType().getSimpleName();
                line = "public " + type + " " + name + "(" + ")\r\n";
                sb.append(line);
                line = "{\r\n";
                sb.append(line);
                line = "return " + name1 + ";\r\n";
                sb.append(line);
                line = "}\r\n";
                sb.append(line);

            }
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = toolkit.getSystemClipboard();
            StringSelection strSel = new StringSelection(sb.toString());
            clipboard.setContents(strSel, null);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static String setterName(Field f) {
        String name = "set" + Character.toUpperCase(f.getName().charAt(0)) + f.getName().substring(1);
        return name;
    }

    public static String getterName(Field f) {
        String name = "get" + Character.toUpperCase(f.getName().charAt(0)) + f.getName().substring(1);
        return name;
    }

}
