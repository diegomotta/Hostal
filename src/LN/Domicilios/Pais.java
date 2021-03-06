package LN.Domicilios;

import LN.Persona.Tipo_Documento;
import LN.Varios.Hosteria;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class Pais extends Observable implements Comparable<Pais>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @OneToOne
    private Tipo_Documento tipoDocumento;
    @OneToMany (cascade= CascadeType.ALL)
    private List<Provincia> provincias;

    public Pais() {
    }

    public Pais(String nombre, Tipo_Documento tipoDocumento) {
        this.id = 0;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.provincias = new LinkedList();
        Hosteria.persistencia.insert(this);
    }

    // <editor-fold defaultstate="collapsed" desc=" Seter y Geter "> 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_Documento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Tipo_Documento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    // </editor-fold>
    public Provincia altaProvincia(String nombreProvincia) throws Exception {
        nombreProvincia = nombreProvincia.trim();
        if ((obtenerProvincia(nombreProvincia)) != null) {
            throw new Exception("La Provincia: " + nombreProvincia + " ya existe");
        } else {
            Provincia unaProvincia = new Provincia(nombreProvincia, this);
            this.provincias.add(unaProvincia);
            Hosteria.getPersistencia().update(this);
            setChanged();
            notifyObservers(unaProvincia);
            return unaProvincia;
        }
    }

    public void bajaProvincia(Provincia unaProvincia) throws Exception {
        try {
            this.provincias.remove(unaProvincia);
            Hosteria.getPersistencia().update(this);
            Hosteria.getPersistencia().delete(unaProvincia);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void modificarProvincia(Provincia unaProvincia, String nombreProvincia) throws Exception {
        if ((obtenerProvincia(nombreProvincia) == null) && (unaProvincia.getNombre().equals(nombreProvincia) != true)) {
            try {
                unaProvincia.setNombre(nombreProvincia);
                Hosteria.getPersistencia().update(this);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }

        } else {
            throw new Exception("Ya xiste una provincia con el nombre " + nombreProvincia);
        }
    }

    public Localidad altaLocalidad(Provincia unaProvincia, String nombreLocalidad) throws Exception {
        Localidad unaLocalidad = unaProvincia.altaLocalidad(nombreLocalidad);
        return unaLocalidad;
    }

    public Localidad modificarLocalidad(Provincia unaProvincia, Localidad unaLocalidad, String nombreLocalidad) throws Exception {
        return unaProvincia.modificarLocalidad(unaLocalidad, nombreLocalidad);
    }

    public void bajaLocalidad(Provincia unaProvincia, Localidad unaLocalidad) throws Exception {
        unaProvincia.bajaLocalidad(unaLocalidad);
    }

    public boolean existeProvincia(Provincia unaProvincia) {
        boolean existe = false;
        List<Provincia> p = this.getProvincias();
        for (Provincia unaProv : p) {
            if (unaProv.equals(unaProvincia)) {
                existe = true;
            }
        }
        return existe;
    }

    public Provincia obtenerProvincia(String nombreProvincia) {
        Provincia devolver = null;
        for (Provincia unaProvincia : this.getProvincias()) {
            if (unaProvincia.getNombre().toUpperCase().equals(nombreProvincia.toUpperCase())) {
                devolver = unaProvincia;
            }
        }
        return devolver;

    }

    @Override
    public boolean equals(Object unObjeto) {
        boolean igual = false;
        if (unObjeto instanceof Pais) {
            if (this.getId().equals(((Pais) unObjeto).getId())) {
                igual = true;
            }
        }
        if (unObjeto instanceof Provincia) {
            if (this.getId().equals(((Provincia) unObjeto).getId())) {
                igual = true;
            }
        }
        return igual;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    public Object[] toVector() {
        Object fila[] = {this, this.getTipoDocumento()};
        return fila;
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombre.compareToIgnoreCase(t.getNombre());
    }
}
