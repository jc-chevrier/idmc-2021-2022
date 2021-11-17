public class Bot {
    public Bot() {}

    public static Bot getInstance() {
        return new Bot();
    }

    public void start() {
        UI.write("Bonjour, comment se passe votre journée ? (bien/mal)");
        String answer = UI.read();
       if(answer.equals("mal")) {
           UI.write("Ah oui que s'est-il passer aujourd'hui ?");
           UI.read();
           UI.write("D'accord je vois, dois-je lancer un skype avec votre famille ? (oui/non)");
           answer = UI.read();
           if(answer.equals("oui")) {
               UI.write("Je lance tout de suite une réunion ! A tout de suite !");
           } else {
               UI.write("D'accord une prochaine fois alors, j'imagine, à tout de suite.");
           }
       } else {
           UI.write("Content de l'entendre ! Et quoi de neuf aujourd'hui ?");
           UI.read();
           UI.write("Voulez-vous que je lance une musique ? (oui/non)");
           answer = UI.read();
           if(answer.equals("oui")) {
               UI.write("D'accord, et qu'est-ce qui vous ferait plaisir comme morceau ?");
               UI.read();
               UI.write("Ok je lance, je me tais, à tout de suite.");
           } else {
               UI.write("D'accord une prochaine fois alors, j'imagine, à tout de suite.");
           }
       }
    }
}