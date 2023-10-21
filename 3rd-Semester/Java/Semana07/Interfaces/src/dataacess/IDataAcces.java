package dataacess;

/**
 *
 * @author augusto
 */
public interface IDataAcces {
    int MAX_RECORD = 10;
    
    void insert();
    
    void get();
    
    void update();
    
    void delete();
}
