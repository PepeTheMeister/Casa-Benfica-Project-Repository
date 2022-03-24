import { Route, Routes } from "react-router-dom";
import AdminNav from "../components/admin/AdminNav";
import AdminPlayersPage from "./AdminPlayersPage";
import AdminProductsPage from "./AdminProductsPage";

function AdminPage() {
  return (
    <div>
      <AdminNav />
      <Routes>
          <Route exact path="/" element={<AdminPlayersPage/>}/>
          <Route exact path="/products" element={<AdminProductsPage/>}/>
      </Routes>
    </div>
  );
}

export default AdminPage;
