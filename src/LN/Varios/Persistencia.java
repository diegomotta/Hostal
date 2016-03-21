package LN.Varios;

import Log_Auditoria.Entidad_Revisada;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

//persistir = f
public class Persistencia {

    private SessionFactory sessionFactory;
    private Session session;

    public Persistencia() throws ExceptionInInitializerError {

        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();


    }

    public void insert(Object unObjeto) {


        Transaction tr = session.beginTransaction();
        session.save(unObjeto);

        tr.commit();

//        hacerAuditoria("gardado", unObjeto);
    }

    public void update(Object unObjeto) {

        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(unObjeto);
        tr.commit();

//                hacerAuditoria("actualizacion", unObjeto);
    }

    public void delete(Object unObject) {

        Transaction tr = session.beginTransaction();
        session.delete(unObject);
        tr.commit();

//        hacerAuditoria("borrado", unObject);
    }

    public Object load(String clase, Serializable id) {
        Object obj = session.load(clase, id);
        return obj;
    }

//    public List restaurar(String classname) {
//        List datos = null;
//        Transaction tr = session.beginTransaction();
//        datos = (List) session.get(classname, 0);
//        tr.commit();
//        return datos;
//    }
    public Object get(Class clase) {
        Object obj = null;
        Transaction tr = session.beginTransaction();
        obj = session.get(clase, 1);
        tr.commit();
        return obj;
    }

    public List buscarRevisiones(String tabla) {
        Transaction tr = session.beginTransaction();
        List resultado;
        SQLQuery consultaSQLQuery = session.createSQLQuery("SELECT * from " + tabla);
        consultaSQLQuery.addEntity(Entidad_Revisada.class);
        resultado = consultaSQLQuery.list();

        tr.commit();
        return resultado;
    }
}
