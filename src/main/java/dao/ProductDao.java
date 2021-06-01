package dao;

import model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ProductDao {

    public void saveProduct(Product product){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            // start transaction
            transaction = session.beginTransaction();

            //save the product
            session.save(product);

            // commit the changes
            transaction.commit();
        }catch (Exception e){
            //roll back
            if(transaction != null)
                transaction.rollback();
            e.printStackTrace();
        }
    }
}
