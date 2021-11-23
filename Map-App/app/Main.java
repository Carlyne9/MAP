package app;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import app.graph.Edge;
import app.graph.Graph;
import app.graph.Vertex;


public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(); //creating an instances of the graph class
        Vertex mainGate = new Vertex("Main Gate");
        Vertex greatHall = new Vertex("Great Hall");
        Vertex nb= new Vertex("N Block");
        Vertex  jqb= new Vertex("James Quartey Building");
        Vertex lawSchool = new Vertex("Law School");
        Vertex balmeLibrary = new Vertex("Balme Library");
        Vertex nnb = new Vertex("New N-Block");
        Vertex ugcs = new Vertex("UGCS");
        Vertex cc = new Vertex("Central Cafeteria");
        Vertex voltaHall = new Vertex("Volta Hall");
        Vertex akuafoHall = new Vertex("Akuafo Hall");
        Vertex legonHall = new Vertex("Legon Hall");
        Vertex nightMarket = new Vertex("Night Market");


        // Adding the nodes to the graph
        graph.addVertex(mainGate);
        graph.addVertex(greatHall);
        graph.addVertex(nb);
        graph.addVertex(jqb);
        graph.addVertex(lawSchool);
        graph.addVertex(balmeLibrary);
        graph.addVertex(nnb);
        graph.addVertex(ugcs);
        graph.addVertex(cc);
        graph.addVertex(voltaHall);
        graph.addVertex(akuafoHall);
        graph.addVertex(legonHall);
        graph.addVertex(nightMarket);


        //adding the edges and getting the distances between vertices
        graph.addEdge(new Edge(mainGate, greatHall, 2400));
        graph.addEdge(new Edge(mainGate,nb , 1200));
        graph.addEdge(new Edge(mainGate, balmeLibrary, 1100));
        graph.addEdge(new Edge(mainGate, jqb, 700));
        graph.addEdge(new Edge(mainGate, nnb, 1600));
        graph.addEdge(new Edge(mainGate, ugcs, 2000));
        graph.addEdge(new Edge(mainGate, cc, 1100));
        graph.addEdge(new Edge(mainGate, voltaHall, 1300));
        graph.addEdge(new Edge(mainGate, akuafoHall, 1100));
        graph.addEdge(new Edge(mainGate, legonHall, 1200));
        graph.addEdge(new Edge(mainGate, nightMarket, 1000));
        graph.addEdge(new Edge(mainGate, lawSchool, 700));

        graph.addEdge(new Edge(greatHall, jqb, 2000));
        graph.addEdge(new Edge(greatHall, nb, 1500));
        graph.addEdge(new Edge(greatHall, nnb, 1600));
        graph.addEdge(new Edge(greatHall, lawSchool, 1600));
        graph.addEdge(new Edge(greatHall, balmeLibrary, 1400));
        graph.addEdge(new Edge(greatHall, ugcs, 1400));
        graph.addEdge(new Edge(greatHall, cc, 1400));
        graph.addEdge(new Edge(greatHall, voltaHall, 1200));
        graph.addEdge(new Edge(greatHall, akuafoHall, 2500));
        graph.addEdge(new Edge(greatHall, legonHall, 1200));
        graph.addEdge(new Edge(greatHall, nightMarket, 2200));
        graph.addEdge(new Edge(greatHall, mainGate, 2000));

        graph.addEdge(new Edge(nnb, jqb, 1000));
        graph.addEdge(new Edge(nnb, nb, 200));
        graph.addEdge(new Edge(nnb, ugcs, 600));
        graph.addEdge(new Edge(nnb, balmeLibrary, 610));
        graph.addEdge(new Edge(nnb, cc, 1500));
        graph.addEdge(new Edge(nnb, voltaHall, 550));
        graph.addEdge(new Edge(nnb, akuafoHall, 1300));
        graph.addEdge(new Edge(nnb, legonHall, 1100));
        graph.addEdge(new Edge(nnb, nightMarket, 1900));
        graph.addEdge(new Edge(nnb, greatHall,1500));
        graph.addEdge(new Edge(nnb, lawSchool, 900));
        graph.addEdge(new Edge(nnb, mainGate, 1300));

        graph.addEdge(new Edge(jqb, nb, 900));
        graph.addEdge(new Edge(jqb, nnb, 950));
        graph.addEdge(new Edge(jqb, ugcs, 850));
        graph.addEdge(new Edge(jqb, balmeLibrary, 840));
        graph.addEdge(new Edge(jqb, cc, 1200));
        graph.addEdge(new Edge(jqb, voltaHall, 1100));
        graph.addEdge(new Edge(jqb, legonHall, 1500));
        graph.addEdge(new Edge(jqb, nightMarket, 1600));
        graph.addEdge(new Edge(jqb, mainGate, 350));
        graph.addEdge(new Edge(jqb, lawSchool, 350));
        graph.addEdge(new Edge(jqb, greatHall, 2000));
        graph.addEdge(new Edge(jqb, akuafoHall, 700));

        graph.addEdge(new Edge(lawSchool, mainGate, 750));
        graph.addEdge(new Edge(lawSchool, greatHall, 2000));
        graph.addEdge(new Edge(lawSchool, nb, 750));
        graph.addEdge(new Edge(lawSchool, balmeLibrary, 850));
        graph.addEdge(new Edge(lawSchool, nnb, 950));
        graph.addEdge(new Edge(lawSchool, ugcs, 850));
        graph.addEdge(new Edge(lawSchool, cc, 1300));
        graph.addEdge(new Edge(lawSchool, voltaHall, 1000));
        graph.addEdge(new Edge(lawSchool, legonHall, 1300));
        graph.addEdge(new Edge(lawSchool, nightMarket, 1800));
        graph.addEdge(new Edge(lawSchool, akuafoHall, 1200));
        graph.addEdge(new Edge(lawSchool, jqb, 3500));


        graph.addEdge(new Edge(ugcs, nb, 550));
        graph.addEdge(new Edge(ugcs, balmeLibrary, 200));
        graph.addEdge(new Edge(ugcs, cc, 800));
        graph.addEdge(new Edge(ugcs, voltaHall, 500));
        graph.addEdge(new Edge(ugcs, akuafoHall, 650));
        graph.addEdge(new Edge(ugcs, legonHall, 600));
        graph.addEdge(new Edge(ugcs, nightMarket, 1300));
        graph.addEdge(new Edge(ugcs, nnb, 650));
        graph.addEdge(new Edge(ugcs, lawSchool, 200));
        graph.addEdge(new Edge(ugcs, jqb, 850));
        graph.addEdge(new Edge(ugcs, mainGate, 900));
        graph.addEdge(new Edge(ugcs, greatHall, 1400));

        graph.addEdge(new Edge(balmeLibrary, nb, 500));
        graph.addEdge(new Edge(balmeLibrary, cc, 800));
        graph.addEdge(new Edge(balmeLibrary, voltaHall, 400));
        graph.addEdge(new Edge(balmeLibrary, akuafoHall, 270));
        graph.addEdge(new Edge(balmeLibrary, legonHall, 800));
        graph.addEdge(new Edge(balmeLibrary, nightMarket, 1200));
        graph.addEdge(new Edge(balmeLibrary, nnb, 850));
        graph.addEdge(new Edge(balmeLibrary, lawSchool, 850));
        graph.addEdge(new Edge(balmeLibrary, greatHall, 1400));
        graph.addEdge(new Edge(balmeLibrary, mainGate, 850));
        graph.addEdge(new Edge(balmeLibrary, jqb, 850));
        graph.addEdge(new Edge(balmeLibrary, ugcs, 200));

        graph.addEdge(new Edge(cc, voltaHall, 650));
        graph.addEdge(new Edge(cc, akuafoHall, 700));
        graph.addEdge(new Edge(cc, legonHall, 500));
        graph.addEdge(new Edge(cc, balmeLibrary, 1100));
        graph.addEdge(new Edge(cc, greatHall, 1100));
        graph.addEdge(new Edge(cc, ugcs, 800));
        graph.addEdge(new Edge(cc, nb, 1200));
        graph.addEdge(new Edge(cc, nnb, 1300));
        graph.addEdge(new Edge(cc, jqb, 1200));
        graph.addEdge(new Edge(cc, nightMarket, 650));
        graph.addEdge(new Edge(cc, mainGate, 1000));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   graph.addEdge(new Edge(cc, lawSchool, 1300));

        graph.addEdge(new Edge(voltaHall, akuafoHall, 1400));
        graph.addEdge(new Edge(voltaHall, legonHall, 190));
        graph.addEdge(new Edge(voltaHall, nightMarket, 1500));

        graph.addEdge(new Edge(akuafoHall, legonHall, 700));
        graph.addEdge(new Edge(akuafoHall, nightMarket, 1100));

        graph.addEdge(new Edge(legonHall, nightMarket, 1300));



        String[] destination = {"Akuafo Hall","Balme Library","Central Cafeteria","Great Hall","JQB","Law School",
                                 "Legon Hall","Main Gate","Night Market","N-Block","New N-Block","UGCS","Volta Hall"};

        JFrame frame = new JFrame();//creating instance of JFrame

        //displaying components in the JFrame
        JLabel Labell = new JLabel();
        Labell.setText("PLEASE CHOOSE YOUR CURRENT LOCATION:");
        Labell.setBounds(10, 10, 300, 40);
        frame.add(Labell);

        JComboBox sourceCombo = new JComboBox(destination);
        sourceCombo.setBounds(50, 50, 200, 20);
        frame.add(sourceCombo);//adding button in JFrame

        JLabel Labelle = new JLabel();
        Labelle.setText("PLEASE CHOOSE YOUR DESTINATION:");
        Labelle.setBounds(10, 70, 300, 40);
        frame.add(Labelle);

        JComboBox destinationCombo = new JComboBox(destination);
        destinationCombo.setBounds(50, 110, 200, 20);
        frame.add(destinationCombo);//adding button in JFrame

        //  inserting a label displaying the shortest path text
        JLabel info = new JLabel();
        info.setText("Shortest Path: ");
        info.setBounds(10, 200, 150, 40);
        frame.add(info);

        JLabel shortestPathDisplay = new JLabel();
        shortestPathDisplay.setBounds(10, 220, 400, 40);
        frame.add(shortestPathDisplay);

        JLabel distanceDisplay = new JLabel();
        distanceDisplay.setBounds(10, 240, 400, 40);
        frame.add(distanceDisplay);

        JButton button = new JButton("Shortest Path");
        button.setBounds(100, 150, 150, 40);
        frame.add(button);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String theOrigin = sourceCombo.getSelectedItem().toString();
                String theEnd = destinationCombo.getSelectedItem().toString();

                Vertex source = graph.getNodeByName(theOrigin);
                Vertex destination = graph.getNodeByName(theEnd);

                Dijkstra.findShortestPath(graph, source, destination);
                String path = Dijkstra.getShortestPath(source, destination);
                shortestPathDisplay.setText(path);

                distanceDisplay.setText("Total Distance: " +Dijkstra.getTotalDistance(destination));
            }
        });

        // Display
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}