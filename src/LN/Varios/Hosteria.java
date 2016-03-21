package LN.Varios;

import Interface.Acceso;
import Interface.GUIM;
import LN.Alquileres.Habitacion;
import LN.Alquileres.Hospedaje;
import LN.Alquileres.Hospedaje_Habitacion;
import LN.Alquileres.Hospedaje_Salon;
import LN.Alquileres.Pileta;
import LN.Alquileres.Reserva_Habitacion;
import LN.Alquileres.Reserva_Salon;
import LN.Alquileres.Salon;
import LN.Alquileres.Tarifa_Habitacion;
import LN.Alquileres.Tarifa_Salon;
import LN.Articulos.Area;
import LN.Articulos.Articulo;
import LN.Articulos.Articulo_Dinamico;
import LN.Articulos.Articulo_Estatico;
import LN.Articulos.Articulos_Adquiridos;
import LN.Articulos.Compra;
import LN.Articulos.Establecimiento;
import LN.Articulos.Faltante;
import LN.Articulos.Unidad_de_Medida;
import LN.Caja.Caja;
import LN.Caja.Conceptos;
import LN.Caja.Cupon;
import LN.Caja.Lote;
import LN.Domicilios.Direccion;
import LN.Domicilios.Localidad;
import LN.Domicilios.Pais;
import LN.Domicilios.Provincia;
import LN.Persona.Estado_Civil;
import LN.Persona.Persona;
import LN.Persona.Sexo;
import LN.Persona.Tipo_Documento;
import LN.Persona.Usuario.Permisos;
import LN.Persona.Usuario.Rol;
import LN.Persona.Usuario.Usuario;
import LN.Persona.Visitante.Afiliado;
import LN.Persona.Visitante.Tercero;
import LN.Persona.Visitante.Visitante;
import Log_Auditoria.Auditoria_Operacional;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Audited
@Entity
public class Hosteria extends Observable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String miCalle;
    private String miProvincia;
    private String miCiudad;
    private String miPais;
    private String telefono1;
    private String telefono2;
    private String email;
    @OneToOne
    public Foto logo = null;
    @OneToMany
    private List<Persona> personas;
    @OneToMany
    @NotAudited
    private List<Pais> paises;
    @OneToMany
    @NotAudited
    private List<Direccion> direcciones;
    @OneToMany
    @NotAudited
    private List<Visitante> visitantes;
    @OneToMany
    @NotAudited
    private List<Estado_Civil> estados_civiles;
    @OneToMany
    @NotAudited
    private List<Sexo> sexos;
    @OneToMany
    @NotAudited
    private List<Tipo_Documento> documentos;
    @OneToMany
    @NotAudited
    private List<Articulo> articulos;
    @OneToMany
    @NotAudited
    private List<Unidad_de_Medida> unidadesDeMedida;
    @OneToMany
    @NotAudited
    private List<Area> areas;
    @OneToMany
    @NotAudited
    private List<Usuario> usuarios;
    @OneToMany
    @NotAudited
    private List<Hospedaje_Habitacion> alquileresHabitacion;
    @OneToMany
    @NotAudited
    private List<Hospedaje_Salon> alquileresSalon;
    @OneToMany
    @NotAudited
    private List<Habitacion> habitaciones;
    @OneToMany
    @NotAudited
    private List<Tarifa_Habitacion> tarifas_Habitacion;
    @OneToMany
    @NotAudited
    private List<Tarifa_Salon> tarifas_Salon;
    @OneToMany
    @NotAudited
    private List<Reserva_Habitacion> reservas;
    @OneToMany
    @NotAudited
    private List<Reserva_Salon> reservas_Salon;
    @OneToMany
    @NotAudited
    private List<Faltante> faltantes;
    @OneToMany
    @NotAudited
    private List<Auditoria_Operacional> audiciones;
    @OneToMany
    @NotAudited
    private List<Compra> compras;
    @OneToMany
    @NotAudited
    private List<Establecimiento> establecimientos;
    @OneToMany
    @NotAudited
    private List<Rol> roles;
    @OneToOne
    @NotAudited
    private Caja cajaPrincipal;
    @OneToOne
    @NotAudited
    private Pileta pileta;
    @OneToMany
    @NotAudited
    private List<Salon> salones;
    public static final String AFILIADO = "Afiliado";
    public static final String TERCERO = "Tercero";
    @OneToOne
    private Maestro unUsuarioMaestro;
    public static Persistencia persistencia = new Persistencia();

    public Hosteria() {
    }

    public Hosteria(String nombre, String telefono1, String telefono2, String unMail, String unaCiudad, String unaProvincia, String unaCalle, Foto unaFoto) {
        this.id = 0;
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.miCalle = unaCalle;
        this.miCiudad = unaCiudad;
        this.miProvincia = unaProvincia;
        this.miPais = "Argentina";
        this.email = unMail;
        this.logo = unaFoto;

        this.paises = new LinkedList<>();
        this.direcciones = new LinkedList<>();
        this.visitantes = new LinkedList<>();
        this.personas = new LinkedList<>();
        this.articulos = new LinkedList<>();
        this.usuarios = new LinkedList<>();
        this.alquileresHabitacion = new LinkedList<>();
        this.alquileresSalon = new LinkedList<>();
        this.reservas = new LinkedList<>();
        this.reservas_Salon = new LinkedList<>();
        this.faltantes = new LinkedList<>();
        this.audiciones = new LinkedList<>();
        this.compras = new LinkedList<>();
        this.establecimientos = new LinkedList<>();
        this.roles = new LinkedList<>();
        this.unUsuarioMaestro = new Maestro("hosteria", "hosteria");

        this.unidadesDeMedida = new LinkedList<>();
        unidadesDeMedida.add(new Unidad_de_Medida("Kilogramo/s", "kg"));
        unidadesDeMedida.add(new Unidad_de_Medida("Gramo/s", "Gr"));
        unidadesDeMedida.add(new Unidad_de_Medida("Litro/s", "Lt"));
        unidadesDeMedida.add(new Unidad_de_Medida("Mililitro/s", "Ml"));
        unidadesDeMedida.add(new Unidad_de_Medida("Metro/s", "M"));
        unidadesDeMedida.add(new Unidad_de_Medida("Centimetro/s", "Cm"));
        unidadesDeMedida.add(new Unidad_de_Medida("Kilometro/s", "Km"));

        this.documentos = new LinkedList<>();
        documentos.add(new Tipo_Documento("DNI"));
        documentos.add(new Tipo_Documento("CI"));
        documentos.add(new Tipo_Documento("CC"));
        documentos.add(new Tipo_Documento("RG"));
        documentos.add(new Tipo_Documento("DUI"));
        documentos.add(new Tipo_Documento("DPI"));
        documentos.add(new Tipo_Documento("OTRO"));


        this.estados_civiles = new LinkedList<>();
        estados_civiles.add(new Estado_Civil(0));
        estados_civiles.add(new Estado_Civil(1));
        estados_civiles.add(new Estado_Civil(2));
        estados_civiles.add(new Estado_Civil(3));

        this.sexos = new LinkedList<>();
        sexos.add(new Sexo(0));
        sexos.add(new Sexo(1));
        sexos.add(new Sexo(2));

        this.areas = new LinkedList<>();
        areas.add(new Area("Limpieza"));
        areas.add(new Area("Habitaciones"));
        areas.add(new Area("Salón"));
        areas.add(new Area("Pileta"));
        areas.add(new Area("Mantenimiento"));
        areas.add(new Area("General"));

        this.habitaciones = new LinkedList<>();
//        for (int z = 1; z <= 18; z++) {
//            habitaciones.add(new Habitacion(z, "Disponible", true, true));
//        }

        this.tarifas_Salon = new LinkedList<>();
        tarifas_Salon.add(new Tarifa_Salon("Salon", 500.0));
        tarifas_Salon.add(new Tarifa_Salon("Salon + Limpieza", 650.0));
        tarifas_Salon.add(new Tarifa_Salon("Salon + Sonido", 700.0));
        tarifas_Salon.add(new Tarifa_Salon("Salon + Cocina", 700.0));
        tarifas_Salon.add(new Tarifa_Salon("Salon + Limpieza + Sonido", 950.0));
        tarifas_Salon.add(new Tarifa_Salon("Salon + Limpieza + Cocina", 950.0));
        tarifas_Salon.add(new Tarifa_Salon("Salon + Cocina + Sonido", 950.0));
        tarifas_Salon.add(new Tarifa_Salon("Completo", 1000.0));
        tarifas_Salon.add(new Tarifa_Salon("Sin Cargo", 0.0));

        this.cajaPrincipal = new Caja("Caja Principal");
        this.pileta = new Pileta(20.00, 2, true);
        this.salones = new LinkedList<>();
        salones.add(new Salon(1, true, true, 200, true, true));


        this.tarifas_Habitacion = new LinkedList<>();
        tarifas_Habitacion.add(new Tarifa_Habitacion("Single", 50.0));
        tarifas_Habitacion.add(new Tarifa_Habitacion("Doble Matrimonial", 100.0));
        tarifas_Habitacion.add(new Tarifa_Habitacion("Doble Separada", 100.0));
        tarifas_Habitacion.add(new Tarifa_Habitacion("Matrimonial + 1", 150.0));
        tarifas_Habitacion.add(new Tarifa_Habitacion("Trible Separada", 150.0));
        tarifas_Habitacion.add(new Tarifa_Habitacion("Matrimonial + 2", 200.0));
        tarifas_Habitacion.add(new Tarifa_Habitacion("Cuadruble Separada", 200.0));
        tarifas_Habitacion.add(new Tarifa_Habitacion("Sin Cargo", 0.0));

        Hosteria.persistencia.insert(this);
    }

    // <editor-fold defaultstate="collapsed" desc=" Setter y Getter "> 
    public Maestro getUnUsuarioMaestro() {
        return unUsuarioMaestro;
    }

    public void setUnUsuarioMaestro(Maestro unUsuarioMaestro) {
        this.unUsuarioMaestro = unUsuarioMaestro;
    }

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

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getMiCalle() {
        return miCalle;
    }

    public void setMiCalle(String miCalle) {
        this.miCalle = miCalle;
    }

    public String getMiProvincia() {
        return miProvincia;
    }

    public void setMiProvincia(String miProvincia) {
        this.miProvincia = miProvincia;
    }

    public String getMiCiudad() {
        return miCiudad;
    }

    public void setMiCiudad(String miCiudad) {
        this.miCiudad = miCiudad;
    }

    public String getMiPais() {
        return miPais;
    }

    public void setMiPais(String miPais) {
        this.miPais = miPais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Foto getLogo() {
        return logo;
    }

    public void setLogo(Foto logo) {
        this.logo = logo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public List<Estado_Civil> getEstados_civiles() {
        return estados_civiles;
    }

    public void setEstados_civiles(List<Estado_Civil> estados_civiles) {
        this.estados_civiles = estados_civiles;
    }

    public List<Sexo> getSexos() {
        return sexos;
    }

    public void setSexos(List<Sexo> sexos) {
        this.sexos = sexos;
    }

    public List<Tipo_Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Tipo_Documento> documentos) {
        this.documentos = documentos;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Unidad_de_Medida> getUnidadesDeMedida() {
        return unidadesDeMedida;
    }

    public void setUnidadesDeMedida(List<Unidad_de_Medida> unidadesDeMedida) {
        this.unidadesDeMedida = unidadesDeMedida;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Hospedaje_Habitacion> getAlquileresHabitacion() {
        return alquileresHabitacion;
    }

    public void setAlquileresHabitacion(List<Hospedaje_Habitacion> alquileresHabitacion) {
        this.alquileresHabitacion = alquileresHabitacion;
    }

    public List<Hospedaje_Salon> getAlquileresSalon() {
        return alquileresSalon;
    }

    public void setAlquileresSalon(List<Hospedaje_Salon> alquileresSalon) {
        this.alquileresSalon = alquileresSalon;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Tarifa_Habitacion> getTarifas_Habitacion() {
        return tarifas_Habitacion;
    }

    public void setTarifas_Habitacion(List<Tarifa_Habitacion> tarifas_Habitacion) {
        this.tarifas_Habitacion = tarifas_Habitacion;
    }

    public List<Tarifa_Salon> getTarifas_Salon() {
        return tarifas_Salon;
    }

    public void setTarifas_Salon(List<Tarifa_Salon> tarifas_Salon) {
        this.tarifas_Salon = tarifas_Salon;
    }

    public List<Reserva_Habitacion> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva_Habitacion> reservas) {
        this.reservas = reservas;
    }

    public List<Faltante> getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(List<Faltante> faltantes) {
        this.faltantes = faltantes;
    }

    public List<Auditoria_Operacional> getAudiciones() {
        return audiciones;
    }

    public void setAudiciones(List<Auditoria_Operacional> audiciones) {
        this.audiciones = audiciones;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public List<Establecimiento> getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(List<Establecimiento> establecimientos) {
        this.establecimientos = establecimientos;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public Caja getCajaPrincipal() {
        return cajaPrincipal;
    }

    public void setCajaPrincipal(Caja cajaPrincipal) {
        this.cajaPrincipal = cajaPrincipal;
    }

    public Pileta getPileta() {
        return pileta;
    }

    public void setPileta(Pileta pileta) {
        this.pileta = pileta;
    }

    public List<Salon> getSalones() {
        return salones;
    }

    public void setSalones(List<Salon> salones) {
        this.salones = salones;
    }

    public static Persistencia getPersistencia() {
        return persistencia;
    }

    public static void setPersistencia(Persistencia persistencia) {
        Hosteria.persistencia = persistencia;
    }

    public static String getAFILIADO() {
        return AFILIADO;
    }

    public static String getTERCERO() {
        return TERCERO;
    }

    public List<Reserva_Salon> getReservas_Salon() {
        return reservas_Salon;
    }

    public void setReservas_Salon(List<Reserva_Salon> reservas_Salon) {
        this.reservas_Salon = reservas_Salon;
    }

    // </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" ABM de Artículos ">
    public void altaArticulo(String nombreArticulo, Area area_aplicacion, Unidad_de_Medida unidad, Integer cuantificacion, Double precioArt) throws Exception {
        if (obtenerArticulo(nombreArticulo) != null) {
            throw new Exception("El Artículo: " + nombreArticulo + " ya existe");
        } else {
            if (precioArt != null) {
                Articulo_Estatico nuevo = new Articulo_Estatico(precioArt, nombreArticulo, area_aplicacion, cuantificacion, unidad);
                this.articulos.add(nuevo);
                Hosteria.persistencia.update(this);
            } else {
                Articulo_Dinamico nuevo = new Articulo_Dinamico(nombreArticulo, area_aplicacion, cuantificacion, unidad);
                this.articulos.add(nuevo);
                Hosteria.persistencia.update(this);
            }

        }
    }

    public void bajaArticulo(Articulo unArticulo) {
        if (existeArticulo(unArticulo)) {
            this.articulos.remove(unArticulo);
            Hosteria.persistencia.update(this);
            Hosteria.persistencia.delete(unArticulo);
        }
    }

    public void modificarArticulo(Articulo unArticulo, String nombreArticulo, Area area_aplicacion, Unidad_de_Medida unidad, Integer cuantificacion) throws Exception {
        if (existeArticulo(unArticulo)) {
            unArticulo.setNombre(nombreArticulo);
            unArticulo.setArea_aplicacion(area_aplicacion);
            unArticulo.setUnidad(unidad);
            unArticulo.setCuantificacion(cuantificacion);
            Hosteria.persistencia.update(this);
        } else {
            throw new Exception("El Artículo seleccionado no existe en el Sistema");
        }
    }

    // </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" ABM de Localidad "> 
    public Localidad altaLocalidad(Pais unPais, Provincia unaProvincia, String nombreLocalidad) throws Exception {
        Localidad unaLocalidad = unPais.altaLocalidad(unaProvincia, nombreLocalidad);
        return unaLocalidad;
    }

    public void bajaLocalidad(Pais unPais, Provincia unaProvincia, Localidad unaLocalidad) throws Exception {
        if (utilizaLocalidad(unaLocalidad.getNombre())) {
            throw new Exception("La localidad: " + unaLocalidad.getNombre() + " no puede ser eliminada");
        } else {
            unPais.bajaLocalidad(unaProvincia, unaLocalidad);
        }

    }

    public void modificarLocalidad(Pais unPais, Provincia unaProvincia, Localidad unaLocalidad, String nombreLocalidad) throws Exception {

        Localidad nuevaLocalidad = unPais.modificarLocalidad(unaProvincia, unaLocalidad, nombreLocalidad);

        List<Direccion> aModificar = seUtilizaLocalidad(unaLocalidad);
        if (!aModificar.isEmpty()) {
            for (Direccion unaDir : aModificar) {
                unaDir.setLocalidad(nuevaLocalidad);
                Hosteria.persistencia.update(this);
            }
        }


    }

    public Direccion altaDireccion(Pais unPais, Provincia unaProvincia, Localidad unaLocalidad, String unDomicilio) throws Exception {
        Direccion unaDireccion = obtenerDireccion(unPais, unaProvincia, unaLocalidad, unDomicilio);
        if (unaDireccion != null) {
            return unaDireccion;
        } else {
            unaDireccion = new Direccion(unPais, unaProvincia, unaLocalidad, unDomicilio);
            this.direcciones.add(unaDireccion);
            Hosteria.persistencia.update(this);
            return unaDireccion;
        }
    }
    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" ABM de Provincia "> 

    public Provincia altaProvincia(Pais unPais, String nombreProvincia) throws Exception {
        Provincia unaProvincia = unPais.altaProvincia(nombreProvincia);
        return unaProvincia;
    }

    public void bajaProvincia(Pais unPais, Provincia unaProvincia) throws Exception {
        if (unPais.existeProvincia(unaProvincia)) {
            if (!utilizaProvincia(unaProvincia.getNombre())) {
                unPais.bajaProvincia(unaProvincia);
            } else {
                throw new Exception("La provincia seleccionada esta siendo utilizada en otra instancia por lo que no puede ser eliminada");
            }
        }
    }

    public void modificarProvincia(Pais unPais, Provincia unaProvincia, String nombreProvincia) throws Exception {
        unPais.modificarProvincia(unaProvincia, nombreProvincia);
    }

    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" ABM de Pais ">
    public void altaPais(String nombrePais, Tipo_Documento tipodoc) throws Exception {
        nombrePais = nombrePais.trim();
        if (obtenerPais(nombrePais) != null) {
            throw new Exception("El País: " + nombrePais + " ya existe");
        } else {
            Pais unPais = new Pais(nombrePais, tipodoc);
            this.paises.add(unPais);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unPais);
        }
    }

    public void bajaPais(Pais unPais) throws Exception {
        if (existePais(unPais)) {
            if (!utilizaPais(unPais.getNombre())) {
                this.paises.remove(unPais);
                Hosteria.persistencia.delete(unPais);
                Hosteria.persistencia.update(this);
            } else {
                throw new Exception("El País " + unPais.getNombre() + " no puede ser eliminado");
            }
        }
    }

    public void modificaPais(Pais unPais, String nombrePais, Tipo_Documento documento) {
        if (existePais(unPais)) {
            unPais.setNombre(nombrePais);
            unPais.setTipoDocumento(documento);
            Hosteria.persistencia.update(this);
        }
    }
// </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" ABM de Unidades de Medida ">

    public void altaUM(String nombreUM, String abrevacionUM) throws Exception {
        if (obtenerUM(nombreUM) != null) {
            throw new Exception("La Unidad de Medida: " + nombreUM + " ya existe");
        } else {
            Unidad_de_Medida nuevaUnidad = new Unidad_de_Medida(nombreUM, abrevacionUM);
            this.unidadesDeMedida.add(nuevaUnidad);
            Hosteria.persistencia.update(this);
        }
    }

    public void modificarUM(Unidad_de_Medida unaUnidad, String nombreUnidad, String abreviacionUnidad) throws Exception {
        if (existeUM(unaUnidad)) {
            unaUnidad.setNombre(nombreUnidad);
            unaUnidad.setAbreviacion(abreviacionUnidad);
            Hosteria.persistencia.update(this);

        } else {
            throw new Exception("La Unidad de Medida " + nombreUnidad + " no existe");
        }
    }

    public void eliminarUM(Unidad_de_Medida unaUM) throws Exception {
        if (existeUM(unaUM)) {
            if (!utilizaUM(unaUM)) {
                this.unidadesDeMedida.remove(unaUM);
                Hosteria.persistencia.delete(unaUM);
                Hosteria.persistencia.update(this);
            } else {
                throw new Exception("La Unidad de Medida " + unaUM + " no puede ser eliminada");
            }
        } else {
            throw new Exception("La Unidad de Medida " + unaUM + " no existe");
        }
    }
    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" ABM de Visitante ">

    public void altaVisitante(String dni, String nombreVis, String apeVis, String e_mail, Estado_Civil st_civ, String motivo_visita,
            String ocupacion, String tel_vis, String condicion_af, String numeroCarnet, Direccion unaDirección, Date fecha_nac, Sexo unSexo) throws Exception {
        if (optenerVisitante(dni) != null) {
            throw new Exception("El Visitante: " + apeVis + " " + nombreVis + " ya existe");
        } else {
            switch (condicion_af) {
                case "Afiliado":
                    Afiliado unAfiliado = new Afiliado(numeroCarnet, st_civ, tel_vis, e_mail, motivo_visita, ocupacion, condicion_af, 0, nombreVis, apeVis, dni, fecha_nac, unSexo, unaDirección);
                    this.visitantes.add(unAfiliado);
                    break;
                case "Tercero":
                    Tercero unTercero = new Tercero(st_civ, tel_vis, e_mail, motivo_visita, ocupacion, condicion_af, 0, nombreVis, apeVis, dni, fecha_nac, unSexo, unaDirección);
                    this.visitantes.add(unTercero);
                    break;
            }
            Hosteria.persistencia.update(this);
        }
    }

    public void bajaVisitante(Visitante unVisitante) {
        if (existeVisitante(unVisitante)) {
            this.visitantes.remove(unVisitante);
            Hosteria.persistencia.delete(unVisitante);
            Hosteria.persistencia.update(this);
        }
    }

    public void modificaVisitante(Visitante unVisitante, String apellido, String nombre, Direccion direccion, String telefono, String e_mail, Date fehca_nac,
            String dni, Sexo sexo, String motivo_visita, String ocupacion, String condicion_af, String numeroCarnet) {
        if (existeVisitante(unVisitante)) {
            switch (condicion_af) {
                case "Afiliado":
                    ((Afiliado) unVisitante).setApellido(apellido);
                    ((Afiliado) unVisitante).setNombre(nombre);
                    ((Afiliado) unVisitante).setDireccion(direccion);
                    ((Afiliado) unVisitante).setTelefono(telefono);
                    ((Afiliado) unVisitante).setE_mail(e_mail);
                    ((Afiliado) unVisitante).setDni(dni);
                    ((Afiliado) unVisitante).setMotivo_visita(motivo_visita);
                    ((Afiliado) unVisitante).setOcupacion(ocupacion);
                    ((Afiliado) unVisitante).setCondicion_af(condicion_af);
                    ((Afiliado) unVisitante).setNumero_carnet(numeroCarnet);
                    ((Afiliado) unVisitante).setSexo(sexo);
                    ((Afiliado) unVisitante).setFnac(fehca_nac);

                    break;
                case "Tercero":
                    unVisitante.setApellido(apellido);
                    unVisitante.setNombre(nombre);
                    unVisitante.setDireccion(direccion);
                    unVisitante.setTelefono(telefono);
                    unVisitante.setE_mail(e_mail);
                    unVisitante.setDni(dni);
                    unVisitante.setMotivo_visita(motivo_visita);
                    unVisitante.setOcupacion(ocupacion);
                    unVisitante.setCondicion_af(condicion_af);
                    unVisitante.setSexo(sexo);
                    unVisitante.setFnac(fehca_nac);
                    break;
            }
            Hosteria.persistencia.update(this);

        }
    }
    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" ABM de Usuarios ">

    public void altaUsuario(String nomUsuario, String apeUsuario, String dni, Rol rol, String password, String ussername, String telUsser, Direccion unaDireccion, String domicilioUsser, Estado_Civil estcivUsser, Sexo unSexo, Date fechaNacimiento, String creadoHora, String unMail, String NC) throws Exception {
        if (obtenerUsuario(nomUsuario) != null) {
            throw new Exception("El usuario que quiere ingresar ya existe");
        } else {
            Usuario nuevoUsuario = new Usuario(password, ussername, creadoHora, telUsser, NC, rol, estcivUsser, unMail, 0, nomUsuario, apeUsuario, dni, fechaNacimiento, unSexo, unaDireccion, domicilioUsser);
            this.usuarios.add(nuevoUsuario);
            setChanged();
            notifyObservers(nuevoUsuario);
            Hosteria.persistencia.update(this);
        }
    }

    public void modificarUsuario(Usuario unUsser, String nomUsuario, String apeUsuario, String dni, Rol rol, String password, String NC,
            String ussername, String telUsser, Direccion unaDireccion, Estado_Civil estcivUsser, Sexo unSexo, Date fechaNacimiento, String creadoHora, String email) throws Exception {

        if (existeUsuario(unUsser)) {
            unUsser.setNombre(nomUsuario);
            unUsser.setApellido(apeUsuario);
            unUsser.setDni(dni);
            unUsser.setNumeroCarnet(NC);
            if (!password.toUpperCase().trim().equals(unUsser.getPasword().toString().toString())) {
                unUsser.setPasword(password);
                unUsser.setCreadoDia(new Date());
            }
            unUsser.setUsserame(ussername);
            unUsser.setTelefono(telUsser);
            unUsser.setDireccion(unaDireccion);
            unUsser.setEstado_civil(estcivUsser);
            if (unSexo != null) {
                unUsser.setSexo(unSexo);
            }
            if (fechaNacimiento != null) {
                unUsser.setFnac(fechaNacimiento);
            }
            unUsser.setRol(rol);
            unUsser.setE_mail(email);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unUsser);

        }
    }

    public void bajaUsuario(Usuario unUsuario) throws Exception {
        if (existeUsuario(unUsuario)) {
            this.usuarios.remove(unUsuario);
            Hosteria.persistencia.update(this);
            Hosteria.persistencia.delete(unUsuario);
            setChanged();
            notifyObservers(unUsuario);
        } else {
            throw new Exception("El Usuario " + unUsuario.getUsserame() + " no puede ser eliminado");
        }
    }

    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" ¿Utiliza? ">
    public boolean utilizaPais(String nombrePais) {
        boolean utiliza = false;
        List<Direccion> d = this.getDirecciones();
        for (Direccion unDomicilio : d) {
            if (unDomicilio.getPais().getNombre().toUpperCase().equals(nombrePais.toUpperCase())) {
                utiliza = true;
            }
        }
        return utiliza;
    }

    public boolean utilizaProvincia(String nombreProvincia) {
        boolean utiliza = false;
        List<Direccion> d = this.getDirecciones();
        for (Direccion unaDireccion : d) {
            if (unaDireccion.getProvincia().getNombre().equals(nombreProvincia)) {
                utiliza = true;
            }
        }
        return utiliza;
    }

    public boolean utilizaLocalidad(String nombreLocalidad) {
        boolean utiliza = false;
        List<Direccion> d = this.getDirecciones();
        for (Direccion unaDir : d) {
            if (unaDir.getLocalidad().getNombre().equals(nombreLocalidad)) {
                utiliza = true;
            }
        }
        return utiliza;
    }

    public List<Direccion> seUtilizaLocalidad(Localidad unaLocalidad) {
        List<Direccion> retornar = new LinkedList<>();
        for (Direccion unadir : this.getDirecciones()) {
            if (unadir.getLocalidad().equals(unaLocalidad)) {
                retornar.add(unadir);
            }
        }
        return retornar;
    }

    public boolean utilizaUM(Unidad_de_Medida unaUM) {
        boolean utiliza = false;
        List<Articulo> arts = this.getArticulos();
        for (Articulo unArt : arts) {
            if (unaUM.equals(unArt.getUnidad())) {
                utiliza = true;
            }
        }
        return utiliza;
    }

    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" Obtener ">
    public Unidad_de_Medida obtenerUM(String nombUnidad) {
        List<Unidad_de_Medida> units = this.getUnidadesDeMedida();
        Unidad_de_Medida retornar = null;
        for (Unidad_de_Medida unaUnidad : units) {
            if (unaUnidad.getNombre().toUpperCase().equals(nombUnidad.toUpperCase())) {
                retornar = unaUnidad;
                break;
            }
        }
        return retornar;
    }

    public Usuario obtenerUsuario(String dniUsuario) {
        List<Usuario> ussers = this.getUsuarios();
        Usuario retornar = null;
        for (Usuario unUsuario : ussers) {
            if (unUsuario.getDni().toUpperCase().equals(dniUsuario.toUpperCase())) {
                retornar = unUsuario;
                break;
            }
        }
        return retornar;
    }

    public Usuario esUsuario(String ussername) {
        List<Usuario> ussers = this.getUsuarios();
        Usuario retornar = null;
        for (Usuario unUsuario : ussers) {
            if (unUsuario.getUsserame().toUpperCase().equals(ussername.toUpperCase())) {
                retornar = unUsuario;
                break;
            }
        }
        return retornar;
    }

    public Pais obtenerPais(String nombrePais) {
        Pais devolver = null;
        if (!this.getPaises().isEmpty()) {
            for (Pais unPais : this.getPaises()) {
                if (unPais.getNombre().toUpperCase().equals(nombrePais.toUpperCase())) {
                    devolver = unPais;
                    break;
                }
            }
        }
        return devolver;
    }

    public Direccion obtenerDireccion(Pais unPais, Provincia unaProvincia, Localidad unaLocalidad, String unDomicilio) {
        List<Direccion> d = this.getDirecciones();
        Direccion retornar = null;
        for (Direccion unaDir : d) {
            if (unaDir.getPais().equals(unPais) && unaDir.getProvincia().equals(unaProvincia) && unaDir.getLocalidad().equals(unaLocalidad) && unaDir.getDomicilio().toUpperCase().trim().equals(unDomicilio.toUpperCase().trim())) {
                retornar = unaDir;
                break;
            }
        }
        return retornar;
    }

    public Articulo obtenerArticulo(String nombreArticulo) {
        Articulo retornar = null;
        List<Articulo> art = this.getArticulos();
        for (Articulo unArticulo : art) {
            if (unArticulo.getNombre().toUpperCase().equals(nombreArticulo.toUpperCase())) {
                retornar = unArticulo;
                break;
            }
        }
        return retornar;
    }

    public Visitante optenerVisitante(String dniVisitante) {
        Visitante res = null;
        List<Visitante> v = this.getVisitantes();
        if (!v.isEmpty()) {
            for (Visitante unVis : v) {
                if (unVis.getDni().equals(dniVisitante)) {
                    res = unVis;
                }
            }
        }
        return res;
    }

    // </editor-fold>    
// <editor-fold defaultstate="collapsed" desc=" ¿Existe?">
    public boolean existePais(Pais unPais) {
        boolean existe = false;

        for (Pais el : this.getPaises()) {
            if (unPais.equals(el)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeUsuario(Usuario unUsuario) {
        boolean existe = false;
        List<Usuario> uss = this.getUsuarios();
        for (Usuario oneUsser : uss) {
            if (oneUsser.equals(unUsuario)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean hayUsuarios() {
        boolean hay = false;
        if (!this.getUsuarios().isEmpty()) {
            hay = true;

        }
        return hay;
    }

    public boolean existeDideccion(Pais unPais, Provincia unaProvincia, Localidad unaLocalidad, String unDomicilio) {
        boolean existe = false;
        List<Direccion> d = this.getDirecciones();
        for (Direccion unaDir : d) {
            if (unaDir.getPais().equals(unPais) && unaDir.getProvincia().equals(unaProvincia) && unaDir.getLocalidad().equals(unaLocalidad) && unaDir.getDomicilio().equals(unDomicilio)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeArticulo(Articulo unArticulo) {
        boolean existe = false;
        List<Articulo> a = this.getArticulos();
        for (Articulo unArt : a) {
            if (unArt.equals(unArticulo)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeVisitante(Visitante unVisitante) {
        boolean existe = false;
        List<Visitante> v = this.getVisitantes();
        for (Visitante vis : v) {
            if (unVisitante.equals(vis)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeUM(Unidad_de_Medida unaUnidad) {
        boolean existe = false;
        List<Unidad_de_Medida> unidades = this.getUnidadesDeMedida();
        for (Unidad_de_Medida oneUnit : unidades) {
            if (oneUnit.getNombre().toUpperCase().equals(unaUnidad.getNombre().toUpperCase())) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean existeReserva(Habitacion unaHabitacion, Date fechaEntrada, Date fechaSalida) {
        Calendar in = Calendar.getInstance();
        Calendar out = Calendar.getInstance();
        in.setTime(fechaEntrada);
        out.setTime(fechaSalida);
        boolean existe = false;
        for (Reserva_Habitacion unaReserva : this.getReservas()) {
            Calendar inR = Calendar.getInstance();
            Calendar outR = Calendar.getInstance();
            inR.setTime(unaReserva.getDesdeFecha());
            outR.setTime(unaReserva.getHastaFecha());

            if (unaReserva.getDeHabitacion().getNumero() == unaHabitacion.getNumero()) {
                if ((in.after(inR) && in.before(outR)) || in.equals(inR)) {
                    existe = true;
                } else if (in.before(inR) && ((out.after(inR) && out.before(outR)) || out.equals(outR))) {
                    existe = true;
                } else if (in.before(inR) && out.after(outR)) {
                    existe = true;
                } else {
                    existe = false;
                }
            }
        }

        return existe;
    }

    public boolean existeHospedaje(Habitacion unaHabitacion, Date fechaEntrada, Date fechaSalida) {
        Calendar in = Calendar.getInstance();
        Calendar out = Calendar.getInstance();
        in.setTime(fechaEntrada);
        out.setTime(fechaSalida);

        boolean existe = false;
        for (Hospedaje_Habitacion unHospedaje : this.getAlquileresHabitacion()) {
            Calendar inR = Calendar.getInstance();
            Calendar outR = Calendar.getInstance();
            inR.setTime(unHospedaje.getIngreso());
            outR.setTime(unHospedaje.getEgreso());

            if (unHospedaje.getUnaHabitacion().getNumero() == unaHabitacion.getNumero()) {
                if ((in.after(inR) && in.before(outR)) || in.equals(inR)) {
                    existe = true;
                } else if (in.before(inR) && ((out.after(inR) && out.before(outR)) || out.equals(outR))) {
                    existe = true;
                } else if (in.before(inR) && out.after(outR)) {
                    existe = true;
                } else {
                    existe = false;
                }
            }
        }

        return existe;
    }

    public boolean existe_ReservaSalon(Date fechaEntrada, Date fechaSalida) {
        Calendar in = Calendar.getInstance();
        Calendar out = Calendar.getInstance();
        in.setTime(fechaEntrada);
        out.setTime(fechaSalida);
        boolean existe = false;
        for (Reserva_Salon unaReserva : this.getReservas_Salon()) {

            Calendar inR = Calendar.getInstance();
            Calendar outR = Calendar.getInstance();
            inR.setTime(unaReserva.getDesdeFecha());
            outR.setTime(unaReserva.getHastaFecha());


            if ((in.after(inR) && in.before(outR)) || in.equals(inR)) {
                existe = true;
            } else if (in.before(inR) && ((out.after(inR) && out.before(outR)) || out.equals(outR))) {
                existe = true;
            } else if (in.before(inR) && out.after(outR)) {
                existe = true;
            } else {
                existe = false;
            }

        }

        return existe;
    }

    public Reserva_Habitacion obtenerReserva(Reserva_Habitacion unaReserva) {
        Reserva_Habitacion resultado = null;
        for (Reserva_Habitacion unaR : this.getReservas()) {
            if (unaR.equals(unaReserva)) {
                resultado = unaR;
            }
        }

        return null;
    }

    public boolean existeReserva_Salon(Salon elSalon, Date fechaEntrada, Date fechaSalida) {
        Calendar in = Calendar.getInstance();
        Calendar out = Calendar.getInstance();
        in.setTime(fechaEntrada);
        out.setTime(fechaSalida);

        boolean existe = false;
        for (Reserva_Salon unaReserva : this.getReservas_Salon()) {
            Calendar inR = Calendar.getInstance();
            Calendar outR = Calendar.getInstance();
            inR.setTime(unaReserva.getDesdeFecha());
            outR.setTime(unaReserva.getHastaFecha());

            if (elSalon instanceof Salon) {
                if (elSalon.getNumero().equals(unaReserva.getElSalon().getNumero())) {
                    if ((in.after(inR) && in.before(outR)) || in.equals(inR)) {
                        existe = true;
                    } else if (in.before(inR) && ((out.after(inR) && out.before(outR)) || out.equals(outR))) {
                        existe = true;
                    } else if (in.before(inR) && out.after(outR)) {
                        existe = true;
                    } else {
                        existe = false;
                    }
                }
            }
        }
        return existe;
    }

    public Reserva_Salon obtener_reservaSalon(Salon elSalon, Date fechaEntrada, Date fechaSalida, Visitante unVisitante) {
        Calendar in = Calendar.getInstance();
        Calendar out = Calendar.getInstance();
        in.setTime(fechaEntrada);
        out.setTime(fechaSalida);

        Reserva_Salon unReserva_Salon = null;

        for (Reserva_Salon unaReserva : this.getReservas_Salon()) {

            Calendar inR = Calendar.getInstance();
            Calendar outR = Calendar.getInstance();
            inR.setTime(unaReserva.getDesdeFecha());
            outR.setTime(unaReserva.getHastaFecha());

            if (elSalon instanceof Salon) {
                if (unaReserva.getUnVisitante().equals(unVisitante)) {
                    if ((in.get(Calendar.DAY_OF_YEAR) == inR.get(Calendar.DAY_OF_YEAR)) && (out.get(Calendar.DAY_OF_YEAR) == outR.get(Calendar.DAY_OF_YEAR))) {
                        unReserva_Salon = unaReserva;
                    }
                }
            }
        }
        return unReserva_Salon;
    }

    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" Reservas">
    public void reservarHabitacion(String unApellido, String unNombre, Date in, Date out, int diasTotales, Habitacion unaHabitacion, Tarifa_Habitacion unTipo) throws Exception {
        if (existeReserva(unaHabitacion, in, out)) {
            throw new Exception("La habitacion que quiere reservar no esta disponible");
        } else if (existeHospedaje(unaHabitacion, in, out)) {
            throw new Exception("La habitacion que quiere reservar esta siendo alquilada actualmente");
        } else {
            Reserva_Habitacion nuevaReserva = new Reserva_Habitacion(unApellido, unNombre, in, out, diasTotales, unaHabitacion, unTipo);
            crearAuditoria("ADD", "Se Resevó una Habitacion " + unTipo.getTipo() + " a " + unApellido + " " + unNombre + " para el día " + in.toString(), Acceso.getUsuario(), GUIM.getHoraActual());
            this.reservas.add(nuevaReserva);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(nuevaReserva);
        }
    }

    public void eliminarReserva(Reserva_Habitacion unaReserva) {
        this.reservas.remove(unaReserva);
        Hosteria.persistencia.update(this);
        Hosteria.persistencia.delete(unaReserva);
        setChanged();
        notifyObservers(unaReserva);

    }

    // </editor-fold>  
// <editor-fold defaultstate="collapsed" desc=" CHECK-IN  Habitacion / Salom">
    public Hospedaje_Habitacion CheckIN_Habitacion(Habitacion unaHabitacion, Visitante unVisitante, Tarifa_Habitacion unaTarifa, Date entrada, Date salida, double unDescuento) throws Exception {
        Hospedaje_Habitacion nuevoHospedaje = null;
        if (unaHabitacion instanceof Habitacion) {
            if (unaHabitacion.getEstado_ocupacion().equals("Disponible")) {
                nuevoHospedaje = new Hospedaje_Habitacion(unaHabitacion, unaTarifa, unVisitante, entrada, salida, unDescuento);
                unaHabitacion.setEstado_ocupacion("Ocupada");
                this.getAlquileresHabitacion().add(nuevoHospedaje);
                Hosteria.persistencia.update(this);
//                Hospedaje_Habitacion elNuevo = this.getAlquileres().get(this.getAlquileres().size() - 1);
//                elNuevo.altaMovimiento_Hospedaje(unaTarifa.getPrecio(), unaTarifa.getTipo(), entrada);
//                this.persistencia.update(this);
            } else {
                Exception e = new Exception("La Habitacion seleccionada no esta disponible para ser Alquilada");
            }
        } else {
            Exception e = new Exception("Algun parametro para el exito de la operacion es incoreccto");
        }

        return nuevoHospedaje;
    }

    public void mod_HospedajeHabitacion(Hospedaje_Habitacion unHospedaje_Habitacion, Tarifa_Habitacion unaTarifa, Date salida, double unDescuento) {
        unHospedaje_Habitacion.setDescuento(unDescuento);
        unHospedaje_Habitacion.setUnaTarifa_Habitacion(unaTarifa);
        unHospedaje_Habitacion.setEgreso(salida);
        Hosteria.persistencia.update(this);
        unHospedaje_Habitacion.corregirMovimiento(unHospedaje_Habitacion);
        Hosteria.persistencia.update(this);

    }

    public void mod_HospedajeSalon(Hospedaje_Salon unHospedaje_Salon, Tarifa_Salon unaTarifa, Date salida, double unDescuento) {
        unHospedaje_Salon.setDescuento(unDescuento);
        unHospedaje_Salon.setServicio(unaTarifa);
        unHospedaje_Salon.setEgreso(salida);
        Hosteria.persistencia.update(this);
        unHospedaje_Salon.corregirMovimiento(unHospedaje_Salon);
        Hosteria.persistencia.update(this);

    }

    public Hospedaje_Salon checkIN_Salon(Visitante unVisitante, Date ingreso, Date egreso, Salon elSalon, Tarifa_Salon servicio, double descuento) throws Exception {
        Hospedaje_Salon nuevoHospedaje_Salon = null;

        if (elSalon instanceof Salon) {
            if (elSalon.getEstado_ocupacion().equals("Disponible")) {
                nuevoHospedaje_Salon = new Hospedaje_Salon(elSalon, servicio, unVisitante, ingreso, egreso, descuento);
                elSalon.setEstado_ocupacion("Ocupado");
                this.alquileresSalon.add(nuevoHospedaje_Salon);
                Hosteria.persistencia.update(this);
            } else {
                throw new Exception("El Salón seleccionado no esta Disponible");
            }
        } else {
            throw new Exception("Algun parametro para el exito de la operacion es incoreccto");
        }
        return nuevoHospedaje_Salon;
    }

// </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" Reservas Habitacion / Salon">
    public void reservar_Salon(Visitante unVisitante, Date desdeFecha, Date hastaFecha, int cantidad_de_Noches, Tarifa_Salon tipo, Salon elSalon) throws Exception {
        if (existeReserva_Salon(elSalon, desdeFecha, hastaFecha)) {
            throw new Exception("El Salon no esta disponible para esta fecha");
        } else {
            Reserva_Salon nuevaReserva_Salon = new Reserva_Salon(unVisitante, desdeFecha, hastaFecha, cantidad_de_Noches, elSalon, tipo);
            this.reservas_Salon.add(nuevaReserva_Salon);
            Hosteria.persistencia.update(this);
        }
    }

    public void modificar_ReservaSalon(Reserva_Salon unaReserva_Salon, Visitante unVisitante, Date desdeFecha, Date hastaFecha, int cantidad_de_Noches, Salon elSalon, Tarifa_Salon tipo) throws Exception {

        if (unaReserva_Salon instanceof Reserva_Salon) {
            unaReserva_Salon.setUnVisitante(unVisitante);
            unaReserva_Salon.setDesdeFecha(desdeFecha);
            unaReserva_Salon.setHastaFecha(hastaFecha);
            unaReserva_Salon.setCantidad_de_Noches(cantidad_de_Noches);
            unaReserva_Salon.setTipo(tipo);
            Hosteria.persistencia.update(this);
        }

    }

    public void eliminar_reservaSalon(Reserva_Salon unaReserva_Salon) {
        this.reservas_Salon.remove(unaReserva_Salon);
        Hosteria.persistencia.update(this);
        Hosteria.persistencia.delete(unaReserva_Salon);

    }

    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" Gestion de Habitaciones">
    public void cambiarEstado_Habitacion(Habitacion unaHabitacion, boolean estado_Habilitacion, boolean estado_Limpieza, double precios[]) {
        unaHabitacion.setEstado_limpieza(estado_Limpieza);
        unaHabitacion.setHabilitado(estado_Habilitacion);

        for (Tarifa_Habitacion unaTarifa_Habitacion : this.getTarifas_Habitacion()) {

            switch (unaTarifa_Habitacion.getTipo()) {
                case Tarifa_Habitacion.SINGLE:
                    unaTarifa_Habitacion.setPrecio(precios[0]);

                    break;
                case Tarifa_Habitacion.DOBLE_MATRIMONIAL:
                case Tarifa_Habitacion.DOBLE_SEPARADA:
                    unaTarifa_Habitacion.setPrecio(precios[1]);

                    break;
                case Tarifa_Habitacion.TRIBLE_MAT_1:
                case Tarifa_Habitacion.TRIBLE_SEPARADA:
                    unaTarifa_Habitacion.setPrecio(precios[2]);

                    break;
                case Tarifa_Habitacion.CUADRUBLE_MAT_2:
                case Tarifa_Habitacion.CUADRUBLE_SEPARADA:
                    unaTarifa_Habitacion.setPrecio(precios[3]);

                    break;
            }
        }
        setChanged();
        notifyObservers(unaHabitacion);

        Hosteria.persistencia.update(this);
    }

    public void agregarHabitacion(String numero, boolean estado_limpieza, boolean habilitado) throws Exception {

        if (existeHabitacion(numero)) {
            throw new Exception("Ya exixte una Habitacion con el numero que ha Ingresado");
        } else {
            Habitacion nuevaHabitacion = new Habitacion(Integer.parseInt(numero), "Disponible", estado_limpieza, habilitado);
            this.habitaciones.add(nuevaHabitacion);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(nuevaHabitacion);
        }
    }

    public boolean existeHabitacion(String numero) {
        boolean existe = false;
        for (Habitacion existentes : this.getHabitaciones()) {
            if (numero.equals(String.valueOf(existentes.getNumero()))) {
                existe = true;
            }
        }
        return existe;
    }

    public void eliminarHabitacion(Habitacion unaHabitacion) throws Exception {
        if (unaHabitacion instanceof Habitacion) {
            unaHabitacion.setEliminado(true);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unaHabitacion);
        } else {
            throw new Exception("Esta Habitación no puede ser eliminada en este momento");
        }
    }

    public void reactivarHabitacion(Integer numero) {
        for (Habitacion unaHabitacion : this.getHabitaciones()) {
            if (numero == unaHabitacion.getNumero()) {
                unaHabitacion.setEliminado(false);
                Hosteria.persistencia.update(this);
                break;
            }
        }

    }

    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" Gestion de Salones">
    public void agregarSalon(String numero, boolean estado_limpieza, boolean habilitado, Integer capacidad, boolean climatizacion, boolean cocina) throws Exception {

        if (existeSalon(numero)) {
            throw new Exception("Ya exixte un Salon con el número que ha Ingresado");
        } else {
            Salon nuevoSalon = new Salon(Integer.parseInt(numero), estado_limpieza, habilitado, capacidad, climatizacion, cocina);
            this.salones.add(nuevoSalon);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(nuevoSalon);
        }
    }

    public boolean existeSalon(String nombre) {
        boolean existe = false;
        for (Salon existentes : this.getSalones()) {
            if (nombre.equals(String.valueOf(existentes.getNumero()))) {
                existe = true;
            }
        }
        return existe;
    }

    public void eliminarSalon(Salon unSalon) throws Exception {
        if (unSalon instanceof Salon) {
            unSalon.setEliminado(true);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unSalon);
        } else {
            throw new Exception("Este Salón no puede ser eliminado");
        }
    }

    public void reactivarSalon(Integer numero) {
        for (Salon unSalon : this.getSalones()) {
            if (numero.equals(unSalon.getNumero())) {
                unSalon.setEliminado(false);
                Hosteria.persistencia.update(this);
                break;
            }
        }

    }

    public void cambiarEstado_Salon(Salon elSalon, boolean estado_Habilitacion, boolean estado_Limpieza, double precios[]) {
        elSalon.setEstado_limpieza(estado_Limpieza);
        elSalon.setHabilitado(estado_Habilitacion);

        for (Tarifa_Salon unaTarifa : this.getTarifas_Salon()) {
            switch (unaTarifa.getTipo()) {
                case Tarifa_Salon.S:
                    unaTarifa.setPrecio(precios[0]);
                    break;
                case Tarifa_Salon.SL:
                    unaTarifa.setPrecio(precios[1]);
                    break;
                case Tarifa_Salon.SLS:
                    unaTarifa.setPrecio(precios[2]);
                    break;
            }
        }

        Hosteria.persistencia.update(this);
    }
    // </editor-fold> 

// <editor-fold defaultstate="collapsed" desc=" CHECK-OUT">
    public void realizar_CHECKOUT(Hospedaje_Habitacion elHospedaje, double total_a_cobrar, boolean conTarjeta, Cupon unCupon, Integer comprobante) throws Exception {
        elHospedaje.getUnaHabitacion().setEstado_limpieza(false);
        elHospedaje.getUnaHabitacion().setEstado_ocupacion("Disponible");
        elHospedaje.setCheck_out(true);
        Hosteria.persistencia.update(this);

        Caja unaCaja = this.getCajaPrincipal();
        Lote unLote = unaCaja.getLotes().get(unaCaja.getLotes().size() - 1);
        String elConcepto = null;

        for (Conceptos unConcepto : unaCaja.getConceptos()) {
            if (unConcepto.getDetalle().equals("Check-OUT Habitación")) {
                elConcepto = unConcepto.getDetalle();
            }
        }
//        Integer comprobante;
//        if (unaCaja.getComprobantes().isEmpty()) {
//            comprobante = 1;
//        } else {
//            comprobante = unaCaja.getComprobantes().size() + 1;
//        }
        if (conTarjeta) {
            unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), total_a_cobrar, "Ingreso", elConcepto, "Tarjeta", comprobante);
        } else {
            unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), total_a_cobrar, "Ingreso", elConcepto, "Efectivo", comprobante);
        }
    }

    public void CheckOut_Salon(Salon unSalon, Hospedaje_Salon unHospedaje_Salon, double total, boolean conTarjeta, Cupon unCupon) throws Exception {
        unHospedaje_Salon.setCheck_out(true);
        unSalon.setEstado_ocupacion("Disponible");
        unSalon.setEstado_limpieza(false);


        Caja unaCaja = this.getCajaPrincipal();
        Lote unLote = unaCaja.obtenerLote_Vigente();

        if (!unLote.isCerrado()) {
            String elConcepto = null;

            for (Conceptos unConcepto : unaCaja.getConceptos()) {
                if (unConcepto.getDetalle().equals("Check-OUT Salón")) {
                    elConcepto = unConcepto.getDetalle();
                }
            }
            Integer comprobante;
            if (unaCaja.getComprobantes().isEmpty()) {
                comprobante = 1;
            } else {
                comprobante = unaCaja.getComprobantes().size() + 1;
            }
            if (conTarjeta) {
                unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), total, "Ingreso", elConcepto, "Tarjeta", comprobante);
            } else {
                unLote.altaMovimiento(new Date(), GUIM.getHoraActual(), total, "Ingreso", elConcepto, "Efectivo", comprobante);
            }
            Hosteria.persistencia.update(this);
        } else {
            throw new Exception("No existe un Lote abierto al que se le pueda asignar el Movimiento de Check-Out Salon");
        }

    }
    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc=" Compras y Faltantes">

    public void registrarFaltante(Articulo unArticulo, double costoEtimado, String causa) throws Exception {
        Faltante nuevoFaltante = new Faltante(unArticulo, new Date(), costoEtimado, causa);
        this.faltantes.add(nuevoFaltante);
        Hosteria.persistencia.update(this);

    }

    public void eliminarFaltante(Faltante unFaltante) throws Exception {
        if (unFaltante instanceof Faltante) {
            this.faltantes.remove(unFaltante);
            Hosteria.persistencia.delete(unFaltante);
            Hosteria.persistencia.update(this);

        } else {
            throw new Exception("No se ha podido eliminar el faltante seleccionado");
        }

    }

    public Articulos_Adquiridos agregarAdquisicion(Articulo unArticulo, double unPrecio, Area unArea, int unaCantidad) {
        Articulos_Adquiridos nuevaAdquisision = new Articulos_Adquiridos(unArticulo, unPrecio, unArea, unaCantidad);
        return nuevaAdquisision;
    }

    public Compra agregarCompra(Numero numeroFactura, Date fecha, String hora, List<Articulos_Adquiridos> articulosRelacionados, int cantidadArticulos, double montoCompra, Establecimiento unEstablecimiento) throws Exception {
        Compra nuevaCompra = null;

        if (articulosRelacionados.isEmpty()) {
            throw new Exception("Usted debe agregar al menos un articulo a la compra antes de realizarla");
        } else {
            nuevaCompra = new Compra(numeroFactura.getNumero(), fecha, hora, articulosRelacionados, cantidadArticulos, montoCompra, unEstablecimiento);
            this.compras.add(nuevaCompra);
            Hosteria.persistencia.update(this);
        }
        return nuevaCompra;
    }

    public Establecimiento obtenerEstablecimiento(String nombre) {
        Establecimiento retornar = null;
        for (Establecimiento unEstablecimiento : this.getEstablecimientos()) {
            if (nombre.toUpperCase().equals(unEstablecimiento.getNombre().toUpperCase())) {
                retornar = unEstablecimiento;
            }
        }
        return retornar;
    }

    public Establecimiento agregarEstablecimiento(String nombre) {
        Establecimiento nuevoEstablecimiento;
        nuevoEstablecimiento = new Establecimiento(nombre);
        this.establecimientos.add(nuevoEstablecimiento);
        Hosteria.persistencia.update(this);
        return nuevoEstablecimiento;

    }
    // </editor-fold> 

    public void altaMovimiento_Hospedaje(double monto, String tipo, Date fechaMovimiento, Hospedaje unHospedaje, String unaHora) {
        unHospedaje.altaMovimiento_Hospedaje(monto, tipo, fechaMovimiento, unaHora);
    }

    public void crearAuditoria(String operacion, String detalle, String usuario, String hora) {
        Auditoria_Operacional nuevaAuditoria_Operacional = new Auditoria_Operacional(operacion, detalle, usuario, hora);
        this.audiciones.add(nuevaAuditoria_Operacional);
        Hosteria.persistencia.update(this);
    }

    public void cambiarClave(Usuario unUsuario, String unaClave) throws Exception {
        if (unUsuario instanceof Usuario) {
            unUsuario.setPasword(unaClave);
            Calendar unCalendar = Calendar.getInstance();
            unCalendar.add(Calendar.MONTH, 3);
            unUsuario.setDiasHabilitado(unCalendar.getTime());
            Hosteria.persistencia.update(this);
        }

    }

    public boolean salonDisponible(Date entra, Date sale) {
        boolean disponible = false;
        for (Hospedaje_Salon unHospedaje_Salon : this.getAlquileresSalon()) {
            if (unHospedaje_Salon.getIngreso().getDay() == entra.getDay() || unHospedaje_Salon.getEgreso().getDay() == sale.getDay()) {
                disponible = true;
            }
        }

        return disponible;
    }

    public Rol agregarRol(String nombre, Map<String, Permisos> permisos) throws Exception {
        Rol nuevoRol = null;
        if (!existeRol(nombre)) {
            nuevoRol = new Rol(nombre, permisos);
            this.roles.add(nuevoRol);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(nuevoRol);
        } else {
            throw new Exception("Este rol ya existe");
        }
        return nuevoRol;
    }

    public void modificarRol(Rol unRol, String nombre, Map<String, Permisos> permisos) throws Exception {
        if (unRol.getNombreRol().toUpperCase().equals(nombre.toUpperCase())) {
            unRol.setPermisos(permisos);
            Hosteria.persistencia.update(this);

        } else if (!existeRol(nombre)) {
            unRol.setNombreRol(nombre);
            unRol.setPermisos(permisos);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unRol);
        } else {
            throw new Exception("El nombre q ha ingresado esta siendo usuado por otro Rol");
        }

    }

    public void eliminarRol(Rol unRol) throws Exception {
        if (utilizaRol(unRol) != true) {
            this.roles.remove(unRol);
            Hosteria.persistencia.delete(unRol);
            Hosteria.persistencia.update(this);
            setChanged();
            notifyObservers(unRol);
        } else {
            throw new Exception("Este Rol no puede ser eliminado ya que esta en uso");
        }

    }

    public boolean utilizaRol(Rol unRol) {
        boolean existe = false;
        if (!this.getUsuarios().isEmpty()) {
            for (Usuario unUsuario : this.getUsuarios()) {
                if (unRol.equals(unUsuario.getRol())) {
                    existe = true;
                    break;
                }
            }
        }
        return existe;
    }

    public boolean existeRol(String nombre) {
        boolean existe = false;
        for (Rol unRol : this.getRoles()) {
            if (unRol.getNombreRol().toUpperCase().equals(nombre.toUpperCase())) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public void editarEmpresa(String nombre, String telefono1, String telefono2, String unMail, String unaCiudad, String unaProvincia, String unaCalle, Foto unaFoto) {
        this.miCalle = unaCalle;
        this.miCiudad = unaCiudad;
        this.miProvincia = unaProvincia;
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.logo = unaFoto;
        this.email = unMail;
        Hosteria.persistencia.update(this);

    }

    public void agregarComprobante(Integer unComprobante) {
        this.getCajaPrincipal().ADD_Compeobante(unComprobante);

    }

    public boolean existeComprobante(Integer unComprobante) {
        return this.getCajaPrincipal().getComprobantes().contains(unComprobante);
    }
}
