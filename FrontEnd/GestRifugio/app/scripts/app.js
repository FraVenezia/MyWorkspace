'use strict';

/**
 * @ngdoc overview
 * @name gestRifugioApp
 * @description
 * # gestRifugioApp
 *
 * Main module of the application.
 */
angular
  .module('gestRifugioApp', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ui.grid',
    'ui.grid.selection',
    'ui.grid.pinning'
  ])
  .config(function ($routeProvider, $locationProvider) {
    $locationProvider.hashPrefix('');
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .when('/booknow', {
        templateUrl: 'views/booknow.html',
        controller: 'BookNowCtrl',
        controllerAs: 'booknow'
      })
      .when('/camere', {
        templateUrl: 'views/camere.html',
        controller: 'CamereCtrl',
        controllerAs: 'camere'
      })
      .when('/contattaci', {
        templateUrl: 'views/contattaci.html',
        controller: 'ContattaciCtrl',
        controllerAs: 'contattaci'
      })
      .when('/manage', {
        templateUrl: 'views/manage.html',
        controller: 'ManageCtrl',
        controllerAs: 'manage'
      })
      .when('/login', {
        templateUrl: 'views/login.html',
        controller: 'LoginCtrl',
        controllerAs: 'login'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
