import { Form, Button } from "react-bootstrap";

import { useState } from "react";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";

function AddPlayerForm() {
  const [selectedDate, setSelectedDate] = useState(null);

  function onChangeDate(date) {
        console.log("date:", date)
  }

  return (
    <Form>
      <Form.Group className="mb-3" controlId="nomeCompleto">
        <Form.Label>Nome Completo</Form.Label>
        <Form.Control type="text" size="sm" placeholder="Nome completo" />
      </Form.Group>

      <Form.Group className="mb-3" controlId="alcunha">
        <Form.Label>Alcunha</Form.Label>
        <Form.Control type="text" size="sm" placeholder="Alcunha" />
      </Form.Group>

      <Form.Group className="mb-3" controlId="numeroJogador">
        <Form.Label>Número do jogador</Form.Label>
        <Form.Control type="number" size="sm" placeholder="Número do jogador" />
      </Form.Group>

      <Form.Group className="mb-3" controlId="dataNascimento">
        <Form.Label>Data de nascimento</Form.Label>
        <Form.Control
          type="date"
          lang="pt"
          onChange={(date) => onChangeDate(date)}
        />
      </Form.Group>
    </Form>
  );
}

export default AddPlayerForm;
