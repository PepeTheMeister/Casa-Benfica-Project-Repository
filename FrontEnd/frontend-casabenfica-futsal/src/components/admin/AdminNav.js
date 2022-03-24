import logo from "../../static/images/logo.jpg";

import { Link } from "react-router-dom";

function AdminNav() {
  return (
    <header>
      <nav className="navbar navbar-expand-lg navbar-dark bg-danger">
        <h2 className="text-light navbar-brand ms-5">
          <img
            src={logo}
            alt=""
            width="60"
            height="60"
            className="ms-2 me-2"
          ></img>
          Futsal Casa Benfica - Admin
        </h2>
        <div className="container-fluid">
          <div
            className="collapse navbar-collapse justify-content-end"
            id="navbarNav"
          >
            <ul className="navbar-nav ">
              <li className="nav-item">
                <Link className="nav-link" to="/admin">
                  Jogadores
                </Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/admin/products">
                  Produtos
                </Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>
  );
}

export default AdminNav;
