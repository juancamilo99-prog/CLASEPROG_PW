public enum EstadoPedido {
    PENDIENTE("El pedido de encuentra en estado pendiente de revision."),
    PROCESANDO("El pedido se encuentra en estado de procesamiento para realizar envio."),
    ENVIADO("El pedido se ha enviado al destinatario."),
    EN_TRANSITO("El pedido se encuentra en transito a pais destinatario"),
    ENTREGADO("Pedido entregado, ok!"),
    CANCELADO("Su pedido se encuentra cancelado.");

    String detallle_pendiente, detalle_procesando, detalle_enviado, detalle_transito;
    EstadoPedido(String detalle){
        this.detallle_pendiente = detalle;
        this.detalle_procesando = detalle;
        this.detalle_enviado = detalle;
        this.detalle_transito = detalle;
    }
}
