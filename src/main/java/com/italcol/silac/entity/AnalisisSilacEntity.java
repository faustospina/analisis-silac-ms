package com.italcol.silac.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "analisis_silac", schema = "db_italcol_silac")
@org.hibernate.annotations.Immutable
public class AnalisisSilacEntity implements Serializable {
    @Id
    @Column(name = "Nun_SILAC")
    private Integer numSilac;
    @Column(name="product_name")
    private String productName;
    @Column(name="tipo_solicitud")
    private String tipoSolicitud;
    @Column(name="linea_producto")
    private String lineaProducto;
    @Column(name="presentacion")
    private String presentacion;
    @Column(name="numero_orden")
    private Integer numeroOrder;
    @Column(name="orden_produccion")
    private Integer orderProduccion;
    @Column(name="numero_formula")
    private Integer numeroFormula;
    @Column(name="lote")
    private Integer lote;
    @Column(name="lote_generado")
    private String loteGenerado;
    @Column(name="analisis")
    private String analisis;
    @Column(name="valor")
    private Double  valor;

}
