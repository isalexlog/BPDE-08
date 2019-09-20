public class TransformToAsterisk implements Transformer {

    public String transform(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = '*';
        }
        return new String(chars);
    }

}
