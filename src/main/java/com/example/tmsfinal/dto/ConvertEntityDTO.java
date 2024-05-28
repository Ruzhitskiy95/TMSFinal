package com.example.tmsfinal.dto;


import com.example.tmsfinal.model.Order;
import com.example.tmsfinal.model.Users;
import org.springframework.stereotype.Component;

@Component
public class ConvertEntityDTO {

    public AdminDTO usersRolesMapAdminChangeRoleDTO (Users users){
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setId(users.getId());
        adminDTO.setEmail(users.getEmail());
        adminDTO.setLogin(users.getLogin());
        adminDTO.setName(users.getName());
        adminDTO.setStatus(users.getStatus());
        adminDTO.setRole(users.getRoles().get(0).getRole());
        return adminDTO;
    }

    public OrderDTO orderMapOrderDTO (Order order){
        OrderDTO orderDTO= new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setBrand(order.getBrand());
        orderDTO.setModel(order.getModel());
        orderDTO.setReleaseDateFrom(order.getReleaseDateFrom());
        orderDTO.setReleaseDateTo(order.getReleaseDateTo());
        orderDTO.setEngineCapacityFrom(order.getEngineCapacityFrom());
        orderDTO.setEngineCapacityTo(order.getEngineCapacityTo());
        orderDTO.setTransmission(order.getTransmission());
        orderDTO.setCarBody(order.getCarBody());
        orderDTO.setPriceFrom(order.getPriceFrom());
        orderDTO.setPriceTo(order.getPriceTo());
        orderDTO.setCreatedData(order.getCreatedData());
        orderDTO.setStatus(order.getStatus());
        return orderDTO;
    }


}
