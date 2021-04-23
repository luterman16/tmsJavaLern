package hw_230421;

public class TextFormater {
    private String line;

    public int countWord (String s) {
        int count = s.split(" ").length;
        return count;
    };

    public boolean isPolindrom(String text) {
        String[] parts = text.split(" ");
        for (String s : parts) {
            StringBuffer rev = new StringBuffer(s).reverse();
            String strRev = rev.toString();
            if (s.equalsIgnoreCase(strRev)) {
                return true;
            }
        }
        return false;
    };

    public TextFormater() {
    }

    public TextFormater(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
