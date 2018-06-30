'use strict';

/**
 * @ngdoc function
 * @name helloworldApp.controller:TableDBCtrl
 * @description
 * # Helloworld2Ctrl
 * Controller of the TableDBdApp
 */
angular.module('helloworldApp')
  .controller('TableDBCtrl', function ($scope, $http) {
    $http.get("http://localhost:8080/users").then(function (response) {
        console.log(response);
        $scope.tabella = response.data;
    });
    
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