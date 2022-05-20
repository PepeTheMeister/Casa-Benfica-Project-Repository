import { Route, Routes} from "react-router-dom";

import AdminPage from "./pages/admin/AdminPage";


function App() {
  return (
    <div >
      <Routes>
        <Route exact path="/admin/*" element={<AdminPage />}></Route>
      </Routes>
    </div>
  );
}

export default App;
