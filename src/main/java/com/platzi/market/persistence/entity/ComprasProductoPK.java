package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable // SE COLOCA PARA EMBEDER LA CLASE DENTRO DE OTRA
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compra") // SE COLOCA CUANDO LA VARIABLE SE LLAMA DIFERENTE A LA COLUMNA
    private Integer idCompra;

    @Column(name = "id_producto") // SE COLOCA CUANDO LA VARIABLE SE LLAMA DIFERENTE A LA COLUMNA
    private Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
