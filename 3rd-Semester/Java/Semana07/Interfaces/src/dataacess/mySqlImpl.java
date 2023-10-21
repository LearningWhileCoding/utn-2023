package dataacess;

/**
 *
 * @author augusto
 */
public class mySqlImpl implements IDataAcces{

    @Override
    public void insert() {
        System.out.println("Insert into Mysql.");
    }

    @Override
    public void get() {
        System.out.println("Get from Mysql.");
    }

    @Override
    public void update() {
        System.out.println("Update in Mysql.");
    }

    @Override
    public void delete() {
        System.out.println("Delete in Mysql");
    }
    
    
}
