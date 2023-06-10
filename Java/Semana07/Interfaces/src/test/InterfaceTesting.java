package test;

import dataacess.*;

/**
 *
 * @author augusto
 */
public class InterfaceTesting {
    
    public static void main(String[] args) {
        
        IDataAcces data = new mySqlImpl();
        //data.get();
        //print(data);
        
        data = new OracleImpl();
        //data.get();
        print(data);
    }
    
    public static void print(IDataAcces data){
        data.get();
    }
}
