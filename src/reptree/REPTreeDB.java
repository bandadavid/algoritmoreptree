/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reptree;

import java.io.BufferedReader;
import java.io.FileReader;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.REPTree;
import weka.core.Debug.Random;
import weka.core.Instances;

/**
 *
 * @author david
 */
public class REPTreeDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /*// Leer data set
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\david\\Documents\\DataSet\\credit-g.arff"));
        
        //Cargar las instacias
        Instances train_data = new Instances(br);
        
        //Poner la clase index y los atributos
        train_data.setClassIndex(train_data.numAttributes()-1);
        
        //Specificar los aprametros para REPTree
        String[] options = {"-M", "-2", "-V", "0.001", "-N", "3", "-S", "1", "-L", "-1"};
        
        //Trabajar en la clasificacion y dispercion
        REPTree tree = new REPTree();
        tree.setOptions(options);
        tree.buildClassifier(train_data);
        
        //Evaluacion
        Evaluation eval = new Evaluation(train_data);
        eval.crossValidateModel(tree, train_data, 10, new Random(1));
        //Imprimir evaluacion
        
        System.out.println(eval.toSummaryString("\n ******** REPTREE ******** \n",true));
        
        
        //Imprimir otra performance measures
        System.out.println("Precision = "+eval.precision(1));
        System.out.println("Recall = "+eval.recall(1));
        System.out.println("F1 Measure = "+eval.fMeasure(1));
        System.out.println("TPR = "+eval.truePositiveRate(1));
        System.out.println("TNR = "+eval.trueNegativeRate(1));
        System.out.println("FPR = "+eval.falsePositiveRate(1));
        System.out.println("FNR = "+eval.falseNegativeRate(1));
        
        //Imprimir la salida del arbol de desicion del algoritmo
        System.out.println("\n\n"+tree.graph().toString());*/
        Interfaz f = new Interfaz();
        f.setVisible (true);
        
    }
    
}
