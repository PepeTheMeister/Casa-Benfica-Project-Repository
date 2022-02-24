package backend.futsal.Casa.Benfica.Portalegre.repositories;

import backend.futsal.Casa.Benfica.Portalegre.entities.AdminUser;
import org.springframework.data.repository.CrudRepository;

public interface AdminUserRepository extends CrudRepository<AdminUser, Long> {
}
