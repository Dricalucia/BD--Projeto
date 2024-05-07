package com.cesar.portaltemaki.service;

import com.cesar.portaltemaki.model.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido findByNrPedido(int nrPedido);
    List<Pedido> findAll();
    void savePedido(Pedido pedido);
    void deletePedido(int nrPedido);
    void updatePedido(Pedido pedido);
}
