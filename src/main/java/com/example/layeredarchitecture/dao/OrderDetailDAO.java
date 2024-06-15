package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailDAO {
    public boolean addOderDetails(String orderId, OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException ;
}


