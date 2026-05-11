import { Component } from '@angular/core';

@Component({
  selector: 'app-contrats',
  templateUrl: './contrats.component.html',
  styleUrls: ['./contrats.component.css']
})
export class ContratsComponent {

  contrats = [
    {
      id: 1,
      client: 'Laila Ninflas',
      type: 'Auto',
      montant: 3500,
      statut: 'EN COURS'
    },

    {
      id: 2,
      client: 'Sara El Amrani',
      type: 'Habitation',
      montant: 2200,
      statut: 'EN COURS'
    },

    {
      id: 3,
      client: 'Yassine Bennani',
      type: 'Santé',
      montant: 4800,
      statut: 'ACTIF'
    }
  ];
}
