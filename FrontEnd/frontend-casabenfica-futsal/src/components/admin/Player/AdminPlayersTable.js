function PlayersTable() {
  return (
    <table className="table table-dark table-striped mt-4">
      <thead>
        <tr>
          <th scope="col">Id</th>
          <th scope="col">Nome Completo</th>
          <th scope="col">Alcunha</th>
          <th scope="col">#Número</th>
          <th scope="col">Data de nascimento</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th scope="row">1</th>
          <td>Mark</td>
          <td>Otto</td>
          <td>@mdo</td>
          <td>@mdo</td>
        </tr>
        {/*<tr>
          <th scope="row">2</th>
          <td>Jacob</td>
          <td>Thornton</td>
          <td>@fat</td>
          <td>@mdo</td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry the Bird</td>
          <td>@twitter</td>
          <td>@mdo</td>
        </tr>*/}
      </tbody>
    </table>
  );
}

export default PlayersTable;
