
package com.tienda.repository;


import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
    // Se crea una cosnulta derivada para recuperar solas las categoprias activas
    public List<Producto> findByActivoTrue();
    
}

