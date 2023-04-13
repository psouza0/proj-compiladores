import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String input = "Use fiber type A for distances up to 10km Add 1 OADM every 5km";

        FiberTypeLexer lexer = new FiberTypeLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FiberTypeParser parser = new FiberTypeParser(tokens);

        ParseTree tree = parser.distanceAndFiberTypeSelection();
        System.out.println(tree.toStringTree(parser));
        
        // Escreve a árvore de análise em um arquivo de texto
        try {
            PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
            writer.println(tree.toStringTree(parser));
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo de saída: " + e.getMessage());
        }
    }
}
