'use strict';

/**
 * @ngdoc function
 * @name helloworldApp.controller:HelloworldCtrl
 * @description
 * # HelloworldCtrl
 * Controller of the helloworldApp
 */
angular.module('helloworldApp')
  .controller('HelloworldCtrl', function ($scope, $http) {
    $scope.helloWorld = {};

    $scope.shareData = function () {
      share.setNomeCognome();
    }
  });
