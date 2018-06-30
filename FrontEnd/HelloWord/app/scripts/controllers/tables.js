'use strict';

/**
 * @ngdoc function
 * @name helloworldApp.controller:TablesCtrl
 * @description
 * # TablesCtrl
 * Controller of the helloworldApp
 */
angular.module('helloworldApp')
    .controller('TablesCtrl', function ($scope, $http) {
        $http.get("http://localhost:8080/users").then(function (response) {
            console.log(response);
            $scope.tabella = response.data;
        });
        $scope.tabella1 = [
            { "nome": "Francesco", "cognome": "Venezia", "email": "fra.venezia@gmail.com" },
            { "nome": "Loredana", "cognome": "Gaudino", "email": "loredana@gmail.com" },
            { "nome": "Nicola", "cognome": "Rossi", "email": "rossi@gmail.com" },
        ]

        $scope.gridOptions = {
            data: 'tabella',

            columnDefs: [{
                name: 'nome',
                displayName: 'Nome',
                width: '15%',
                type: 'text'
            },
            {
                name: 'cognome',
                displayName: 'Cognome',
                width: '15%',
                type: 'text'
            },
            {
                name: 'email',
                displayName: 'E-Mail',
                //width: '30%'
            }],
            onRegisterApi: function (gridApi) {
                $scope.gridApi = gridApi;
            }
        }
    });