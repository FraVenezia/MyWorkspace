'use strict';

/**
 * @ngdoc function
 * @name gestRifugioApp.controller:ManageCtrl
 * @description
 * # ManageCtrl
 * Controller of the gestRifugioApp
 */
angular.module('gestRifugioApp')
  .controller('ManageCtrl', function ($scope, $http) {
    $scope.gridOptions = {
      data: 'tabella',

      columnDefs: [{
        name: 'NumBooking',
        displayName: 'Numero Prenotazione',
        width: '15%'
      },
      {
        name: 'nome',
        displayName: 'Nome',
        width: '15%'
      },
      {
        name: 'cognome',
        displayName: 'Cognome',
        width: '15%'
      },
      {
        name: 'email',
        displayName: 'E-Mail',
        width: '15%'
      },
      {
        name: 'bookingdate',
        displayName: 'Data Prenotazione',
        width: '15%'
      },
      {
        name: 'checkin',
        displayName: 'Data Check-In',
        width: '15%'
      },
      {
        name: 'checkout',
        displayName: 'Data Check-Out',
        width: '15%'
      },
      {
        name: 'idroom',
        displayName: 'IDRoom',
        width: '15%'
      },
      {
        name: 'pricetotal',
        displayName: 'PriceTotal',
        width: '15%'
      }],
      onRegisterApi: function (gridApi) {
        $scope.gridApi = gridApi;
      }
    }
  });
