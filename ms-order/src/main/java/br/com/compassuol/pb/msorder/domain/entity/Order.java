package br.com.compassuol.pb.msorder.domain.entity;

public class Order {
    private Integer id;
    private String cpf;
    private Items items;
    private Double amount;
    private String orderStatus;
    private String paymentStatus;
    private Integer idPayment;

}

