package LN.Varios;

import Interface.GUIM;
import java.awt.Image;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.ImageIcon;
import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;
@Audited
@Entity
public class Foto extends ImageIcon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Type(type = "org.hibernate.type.PrimitiveByteArrayBlobType")
    private byte[] foto;

    public Foto() {
    }

    public Foto(String url) {
        super(url);
        foto = GUIM.toArrayByte(url);
        Hosteria.persistencia.insert(this);

    }

    public Foto(byte[] foto, String extencion) {
        super(foto);
        this.foto = foto;
        Hosteria.persistencia.insert(this);

    }

    public Object[] toVector() {
        return new Object[]{this};
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (getId() == null || ((Foto) obj).getId() == null) {
            return false;
        }
        return ((Foto) obj).getId().equals(this.getId());
    }

    @Override
    public Image getImage() {

        return new ImageIcon(foto).getImage();


    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
