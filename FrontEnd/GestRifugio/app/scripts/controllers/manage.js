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

        $http.get("http://localhost:8080/booking").then(function (response) {
            console.log(response);
            $scope.tabella = response.data;
        });


        $scope.gridOptions = {
            data: 'tabella',

            columnDefs: [{
                name: 'numbooking',
                displayName: 'ID',
                width: '3%',
            },
            {
                name: 'bookingdate',
                displayName: 'Day Booking',
                width: '8%',
            },
            {
                name: 'customer.nome',
                displayName: 'Nome',
            },
            {
                name: 'customer.cognome',
                displayName: 'Cognome',
            },
            {
                name: 'customer.email',
                displayName: 'E-Mail',
            },
            {
                name: 'bookingroom[0].room.num',
                displayName: 'N. Stanza',
                width: '7%',
            },
            {
                name: 'bookingroom[0].room.typeroom',
                displayName: 'Tipo Stanza',
            },
            {
                name: 'bookingroom[0].room.price',
                displayName: '€ x Notte',
                width: '7%',
            },
            {
                name: 'bookingroom[0].checkin',
                displayName: 'Check-in',
                width: '8%',
            },
            {
                name: 'bookingroom[0].checkout',
                displayName: 'Check-out',
                width: '8%',
            },
            {
                name: 'pricetotal',
                displayName: 'Totale',
                width: '7%',
            }],
            onRegisterApi: function (gridApi) {
                $scope.gridApi = gridApi;
            }
        }
    });
