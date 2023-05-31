public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String text = scanner.nextLine();
        String text = "I love apple music. Apple, plum juice are beneficial. Plum is a fruit. plum ";
        text = text.replaceAll(" [A,a]pple", " pear ");
        int first_index_of_plum = text.lastIndexOf("Plum") > text.lastIndexOf("plum") ? text.lastIndexOf("Plum"): text.lastIndexOf("plum");
        int  last_plum_index = first_index_of_plum;
        text = text.replace( text.substring( last_plum_index, last_plum_index + 4), "Milk");
        System.out.println(text);

    }
}