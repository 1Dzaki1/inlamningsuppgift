package Projekt;

public class Reader {
    private int antalTecken;
    private int antalRader;
    private StringBuilder inputText;

    public Reader() {
        antalTecken = 0;
        antalRader = 0;
        inputText = new StringBuilder();
    }

    public void avlasare(String line) {
        antalTecken += line.length();
        antalRader++;
        inputText.append(line).append("\n");
    }

    public int getAntalTecken() {
        return antalTecken;
    }

    public int getAntalRader() {
        return antalRader;
    }

    public String getInputText() {
        return inputText.toString();
    }
}


