package backend.futsal.Casa.Benfica.Portalegre.services;


import backend.futsal.Casa.Benfica.Portalegre.dto.AdminUserDto;
import backend.futsal.Casa.Benfica.Portalegre.entities.AdminUser;
import backend.futsal.Casa.Benfica.Portalegre.repositories.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class AdminUserService {

    @Autowired
    AdminUserRepository adminUserRepository;

    public AdminUser addAdminUser(AdminUser adminUser) {
        adminUser.setLastModify(new Date(System.currentTimeMillis()));
        return adminUserRepository.save(adminUser);
    }

    public AdminUserDto getAdminUserById(long id) {
        Optional<AdminUser> optAdminUser = adminUserRepository.findById(id);
        return optAdminUser.orElse(null) != null ? new AdminUserDto(optAdminUser.orElse(null)) : null;
    }

    public boolean updateAdminUser(AdminUser adminUser) {
        if(adminUserRepository.existsById(adminUser.getId())){
            adminUser.setLastModify(new Date(System.currentTimeMillis()));
            adminUserRepository.save(adminUser);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean deleteAdminUserById(long id) {
        if(adminUserRepository.existsById(id)){
            adminUserRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
