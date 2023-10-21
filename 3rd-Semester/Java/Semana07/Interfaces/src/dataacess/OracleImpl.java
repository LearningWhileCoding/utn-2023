package dataacess;

/**
 *
 * @author augusto
 */
public class OracleImpl implements IDataAcces{

    @Override
    public void insert() {
        System.out.println("Insert into Oracle.");
    }

    @Override
    public void get() {
        System.out.println("Get from Oracle.");
    }

    @Override
    public void update() {
        System.out.println("Update in Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Delete in Oracle");
    }
    
}
