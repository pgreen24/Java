public class pizza {
    String bread;
    String sauce;
    String chess;
    String topping;

    pizza() {
    }

    pizza(String bread) {
        this.bread = bread;
    }

    pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    pizza(String bread, String sauce, String chess) {
        this.bread = bread;
        this.sauce = sauce;
        this.chess = chess;
    }

    pizza(String bread, String sauce, String chess, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.chess = chess;
        this.topping = topping;
    }
}
